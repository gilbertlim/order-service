package com.gilbert.msa.service.inner.mapper;

import com.gilbert.msa.proto.ProductGrpc;
import com.gilbert.msa.service.dto.ProductDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GrpcMapper {

    ProductDto toDto(ProductGrpc productGrpc);
}