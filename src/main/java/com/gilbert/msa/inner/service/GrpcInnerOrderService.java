package com.gilbert.msa.inner.service;

import com.gilbert.msa.inner.InnerOrderService;
import com.gilbert.msa.service.dto.ProductDto;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@ConfigurationProperties()
@Service
public class GrpcInnerOrderService implements InnerOrderService {

    @Override
    public List<ProductDto> getProducts(List<Long> productIds) {
        return null;
    }
}
