package com.gilbert.msa.service.mapper;

import com.gilbert.msa.domain.entity.OrderItem;
import com.gilbert.msa.service.dto.ProductDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {

    OrderItem toEntity(ProductDto productDto);

}