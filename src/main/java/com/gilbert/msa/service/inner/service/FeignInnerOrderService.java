package com.gilbert.msa.service.inner.service;

import com.gilbert.msa.service.dto.ProductDto;
import com.gilbert.msa.service.inner.InnerOrderService;
import com.gilbert.msa.service.inner.client.ProductFeignClient;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@ConditionalOnProperty(name = "inner-communication.method", havingValue = "feign", matchIfMissing = true)
@Service
public class FeignInnerOrderService implements InnerOrderService {

    private final ProductFeignClient productFeignClient;

    @Override
    public List<ProductDto> getProducts(List<Long> productIds) {
        return productFeignClient.getProducts(productIds);
    }
}
