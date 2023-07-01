package com.gilbert.msa.service;

import com.gilbert.msa.domain.entity.Order;
import com.gilbert.msa.domain.entity.OrderItem;
import com.gilbert.msa.repository.OrderRepository;
import com.gilbert.msa.service.dto.OrderDto;
import com.gilbert.msa.domain.dto.OrderFormRequestDto;
import com.gilbert.msa.service.dto.ProductDto;
import com.gilbert.msa.service.inner.InnerOrderService;
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

    private final OrderMapper orderMapper;

    private final InnerOrderService innerOrderService;

    @Transactional
    public String createOrder(OrderFormRequestDto orderFormRequestDto) {
        validateProductQuantity(orderFormRequestDto);

        List<OrderItem> orderItems = orderFormRequestDto.getProductDtos().stream()
            .map(p -> new OrderItem(p.getProductId(), p.getQuantity()))
            .toList();

        Order order = new Order(orderFormRequestDto.getMemberId(), orderItems);

        orderRepository.save(order);

        log.info("주문 완료");
        return "주문이 완료되었습니다.";
    }

    private void validateProductQuantity(OrderFormRequestDto orderFormDto) {
        List<ProductDto> orderedProducts = orderFormDto.getProductDtos();

        List<Long> orderedProductIds = orderFormDto.getProductDtos().stream()
            .map(ProductDto::getProductId)
            .toList();

        List<ProductDto> currentProducts = innerOrderService.getProducts(orderedProductIds);

        for (ProductDto ordered : orderedProducts) {
            currentProducts.stream()
                .filter(current -> current.getProductId().equals(ordered.getProductId()))
                .filter(current -> current.getQuantity() < ordered.getQuantity())
                .forEach(current -> {
                    log.error("재고 수량이 부족합니다. 상품:{}, 요청:{}/재고:{}", current.getProductName(), ordered.getQuantity(), current.getQuantity());
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