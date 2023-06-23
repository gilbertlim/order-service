package com.gilbert.msa.domain.mapper;

import com.gilbert.msa.domain.dto.OrderDto;
import com.gilbert.msa.domain.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toEntity(OrderDto dto);

    OrderDto toDto(Order entity);
}