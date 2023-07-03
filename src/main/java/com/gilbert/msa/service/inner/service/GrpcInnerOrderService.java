package com.gilbert.msa.service.inner.service;

import com.gilbert.msa.proto.ProductRequestGrpc;
import com.gilbert.msa.proto.ProductResponseGrpc;
import com.gilbert.msa.proto.ProductServiceGrpc;
import com.gilbert.msa.service.dto.ProductDto;
import com.gilbert.msa.service.inner.InnerOrderService;
import com.gilbert.msa.service.inner.mapper.GrpcMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@ConditionalOnProperty(name = "inner-communication.method", havingValue = "grpc")
@Service
public class GrpcInnerOrderService implements InnerOrderService {

    private final GrpcMapper grpcMapper;

    @GrpcClient("product")
    private ProductServiceGrpc.ProductServiceBlockingStub productStub;

    @Override
    public List<ProductDto> getProducts(List<Long> productIds) {
        ProductRequestGrpc productRequestGrpc = ProductRequestGrpc.newBuilder()
            .addAllProductIds(productIds)
            .build();

        ProductResponseGrpc productResponseGrpc = productStub.getProducts(productRequestGrpc);

        return productResponseGrpc.getProductGrpcList().stream()
            .map(grpcMapper::toDto)
            .toList();
    }
}
