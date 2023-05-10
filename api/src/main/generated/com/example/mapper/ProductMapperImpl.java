package com.example.mapper;

import com.example.domain.Product;
import com.example.dto.ProductReqDto;
import com.example.dto.ProductResDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-25T12:29:14+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Azul Systems, Inc.)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResDto toDto(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductResDto.ProductResDtoBuilder productResDto = ProductResDto.builder();

        productResDto.id( entity.getId() );
        productResDto.productName( entity.getProductName() );
        productResDto.brandName( entity.getBrandName() );
        productResDto.modelNumber( entity.getModelNumber() );
        productResDto.description( entity.getDescription() );
        productResDto.price( entity.getPrice() );
        productResDto.category( entity.getCategory() );
        productResDto.availability( entity.isAvailability() );
        productResDto.color( entity.getColor() );
        productResDto.warranty( entity.getWarranty() );

        return productResDto.build();
    }

    @Override
    public Product toEntity(ProductReqDto dto) {
        if ( dto == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        product.id( dto.getId() );
        product.productName( dto.getProductName() );
        product.brandName( dto.getBrandName() );
        product.modelNumber( dto.getModelNumber() );
        product.description( dto.getDescription() );
        product.price( dto.getPrice() );
        product.category( dto.getCategory() );
        product.availability( dto.isAvailability() );
        product.color( dto.getColor() );
        product.warranty( dto.getWarranty() );

        return product.build();
    }

    @Override
    public void updateProductFromDto(ProductReqDto dto, Product entity) {
        if ( dto == null ) {
            return;
        }
    }
}
