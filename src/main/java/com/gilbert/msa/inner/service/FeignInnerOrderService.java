package com.gilbert.msa.inner.service;

import com.gilbert.msa.inner.InnerOrderService;
import com.gilbert.msa.service.dto.ProductDto;
import java.util.List;

public class FeignInnerOrderService implements InnerOrderService {

    @Override
    public List<ProductDto> getProducts(List<Long> productIds) {
        return null;
    }
}
