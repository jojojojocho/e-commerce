package com.example.mapper;

import com.example.domain.Product;
import com.example.dto.ProductReqDto;
import com.example.dto.ProductResDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends GenericMapper<ProductReqDto, ProductResDto, Product> {


}
