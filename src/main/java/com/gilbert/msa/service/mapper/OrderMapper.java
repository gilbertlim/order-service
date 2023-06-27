package com.gilbert.msa.service.mapper;

import com.gilbert.msa.domain.entity.Order;
import com.gilbert.msa.service.dto.OrderDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toEntity(OrderDto orderDto);

    OrderDto toDto(Order order);
}