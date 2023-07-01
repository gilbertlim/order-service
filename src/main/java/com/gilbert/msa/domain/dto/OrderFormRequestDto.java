package com.gilbert.msa.domain.dto;

import com.gilbert.msa.service.dto.OrderDto;
import com.gilbert.msa.service.dto.ProductDto;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderFormRequestDto extends OrderDto {

    private List<ProductDto> productDtos;
}