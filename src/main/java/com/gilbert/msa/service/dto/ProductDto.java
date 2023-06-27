package com.gilbert.msa.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto extends OrderDto {

    private Long productId;
    private String productName;
    private Integer price;
    private Integer quantity;
}