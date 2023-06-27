package com.gilbert.msa.service;

import com.gilbert.msa.client.ProductFeignClient;
import com.gilbert.msa.domain.entity.Order;
import com.gilbert.msa.domain.entity.OrderItem;
import com.gilbert.msa.repository.OrderItemRepository;
import com.gilbert.msa.repository.OrderRepository;
import com.gilbert.msa.service.dto.OrderDto;
import com.gilbert.msa.service.dto.OrderFormRequestDto;
import com.gilbert.msa.service.dto.ProductDto;
import com.gilbert.msa.service.mapper.OrderMapper;
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

    private final OrderRepository orderRepository;

    private final OrderItemRepository orderItemRepository;

    private final OrderMapper orderMapper;

    private final ProductFeignClient productFeignClient;

    @Transactional
    public String createOrder(OrderFormRequestDto orderFormDto) {
        validateProductQuantity(orderFormDto);

//        Order order = orderMapper.toEntity(orderFormDto);

        List<OrderItem> orderItems = orderFormDto.getProductDtos().stream()
            .map(p -> new OrderItem(p.getProductId(), p.getQuantity()))
            .toList();

        Order order = new Order(orderFormDto.getMemberId(), orderItems);

        orderRepository.save(order);

//        orderItemRepository.saveAll(orderItems);

        log.info("주문 완료");
        return "주문이 완료되었습니다.";
    }

    private void validateProductQuantity(OrderFormRequestDto orderFormDto) {
        List<ProductDto> requestProductDtos = orderFormDto.getProductDtos();

        List<Long> productIds = orderFormDto.getProductDtos().stream()
            .map(ProductDto::getProductId)
            .toList();

        List<ProductDto> responseProductDtos = productFeignClient.getProducts(productIds);

        for (ProductDto req : requestProductDtos) {
            responseProductDtos.stream()
                .filter(res -> res.getProductId().equals(req.getProductId()))
                .filter(res -> res.getQuantity() < req.getQuantity())
                .forEach(res -> {
                    log.error("재고 수량이 부족합니다. 상품:{}, 요청:{}/재고:{}", res.getProductName(), req.getQuantity(), res.getQuantity());
                    throw new RuntimeException("재고 수량 부족");
                });
        }
    }

    public OrderDto getOrder(Long id) {
        Order entity = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Couldn't find id: " + id));
        return orderMapper.toDto(entity);
    }

    public List<OrderDto> getOrders() {
        return orderRepository.findAll()
            .stream()
            .map(orderMapper::toDto)
            .toList();
    }

    @Transactional
    public void cancelOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}