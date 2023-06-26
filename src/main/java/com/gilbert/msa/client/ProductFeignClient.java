package com.gilbert.msa.client;

import com.gilbert.msa.domain.dto.ProductDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "product", url = "${service.product.base-url}")
public interface ProductFeignClient {

    @PostMapping("/products/ids")
    List<ProductDto> getProducts(@Param("productIds") List<Integer> productIds);
}