package com.gilbert.msa.client;

import com.gilbert.msa.service.dto.ProductDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "product", url = "${service.product.base-url}")
public interface ProductFeignClient {

    @GetMapping("/products")
    List<ProductDto> getProducts(@RequestParam(required = false) List<Long> productIds);
}