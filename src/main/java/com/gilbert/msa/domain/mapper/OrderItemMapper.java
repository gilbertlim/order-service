package com.gilbert.msa.domain.mapper;

import com.gilbert.msa.domain.dto.ProductDto;
import com.gilbert.msa.domain.entity.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {

//    @Mapping(source = "orderId", target = "order_id")
    @Mapping(source = "productId", target = "product_id")
    OrderItem toEntity(ProductDto productDto);

}