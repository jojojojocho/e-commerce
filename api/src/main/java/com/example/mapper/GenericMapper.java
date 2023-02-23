package com.example.mapper;

import com.example.domain.Product;
import com.example.dto.ProductReqDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;


public interface GenericMapper<T,R,E> {

    R toDto(E entity);
    E toEntity(T dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateProductFromDto(T dto, @MappingTarget E entity);
    }


