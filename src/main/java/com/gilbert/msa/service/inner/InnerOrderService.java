package com.gilbert.msa.service.inner;

import com.gilbert.msa.service.dto.ProductDto;
import java.util.List;

public interface InnerOrderService {

    List<ProductDto> getProducts(List<Long> productIds);
}
