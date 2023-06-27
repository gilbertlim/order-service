package com.gilbert.msa.service.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderFormRequestDto extends OrderDto {

    private List<ProductDto> productDtos;
}