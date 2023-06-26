package com.gilbert.msa.domain.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderFormDto extends OrderDto {

    private List<ProductDto> productDtoList;
}