package com.gilbert.msa.controller;

import com.gilbert.msa.service.dto.OrderDto;
import com.gilbert.msa.domain.dto.OrderFormRequestDto;
import com.gilbert.msa.service.OrderService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/orders")
@RestController
public class OrderController {

    private final OrderService service;

    @PostMapping
    public String createOrder(@RequestBody OrderFormRequestDto requestDto) {
        log.info("createOrder");
        return service.createOrder(requestDto);
    }

    @GetMapping("/{orderId}")
    public OrderDto getOrder(@PathVariable Long orderId) {
        log.info("getOrder");
        return service.getOrder(orderId);
    }

    @GetMapping
    public List<OrderDto> getOrders() {
        log.info("getOrders");
        return service.getOrders();
    }

    @DeleteMapping("/{orderId}")
    public void cancelOrder(@PathVariable Long orderId) {
        log.info("cancelOrder");
        service.cancelOrder(orderId);
    }
}
