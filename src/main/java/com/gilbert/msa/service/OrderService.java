package com.gilbert.msa.service;

import com.gilbert.msa.client.ProductFeignClient;
import com.gilbert.msa.domain.dto.OrderDto;
import com.gilbert.msa.domain.dto.OrderFormDto;
import com.gilbert.msa.domain.dto.ProductDto;
import com.gilbert.msa.domain.entity.Order;
import com.gilbert.msa.domain.mapper.OrderMapper;
import com.gilbert.msa.repository.OrderRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;
    private final OrderMapper mapper;

    private final ProductFeignClient productFeignClient;

    @Transactional
    public void createOrder(OrderFormDto orderFormDto) {
        List<ProductDto> productDtoList = orderFormDto.getProductDtoList();
        
        List<Integer> productIds = orderFormDto.getProductDtoList().stream()
            .map(ProductDto::getProductId)
            .toList();

        
        List<ProductDto> productInfos = productFeignClient.getProducts(productIds);
        
        for (ProductDto dto : productDtoList) {
            for ( ProductDto info : productInfos) {
                if (dto.getProductId().equals(info.getProductId())) {
                    if (dto.getQuantity() > info.getQuantity()) {
                        log.error("재고 수량이 부족합니다. 상품:{}, 요청:{}/재고:{}", info.getProductName(), dto.getQuantity(), info.getQuantity());
                    }
                }
            }
        }


        //        repository.save(mapper.toEntity(orderDto));
    }

    public OrderDto getOrder(Long id) {

        Order entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Couldn't find id: " + id));
        return mapper.toDto(entity);
    }

    public List<OrderDto> getOrders() {
        return repository.findAll()
            .stream()
            .map(mapper::toDto)
            .toList();
    }

    @Transactional
    public void cancelOrder(OrderDto dto) {
        repository.delete(mapper.toEntity(dto));
    }
}