package com.example.mapper;

import com.example.domain.Product;
import com.example.dto.ProductReqDto;
import com.example.dto.ProductResDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ProductMapper extends GenericMapper<ProductReqDto, ProductResDto, Product> {

    ProductResDto toDto(Product entity);
    Product toEntity(ProductReqDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateProductFromDto(ProductReqDto dto, @MappingTarget Product entity);

}

