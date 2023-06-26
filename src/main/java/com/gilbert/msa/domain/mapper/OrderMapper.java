package com.gilbert.msa.domain.mapper;

import com.gilbert.msa.domain.dto.OrderDto;
import com.gilbert.msa.domain.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(source = "memberId", target = "member_id")
    @Mapping(source = "orderId", target = "order_id")
    Order toEntity(OrderDto orderDto);

    @Mapping(source = "member_id", target = "memberId")
    @Mapping(source = "order_id", target = "orderId")
    OrderDto toDto(Order order);
}