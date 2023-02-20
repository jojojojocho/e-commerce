package com.example.mapper;

import org.mapstruct.MappingTarget;


public interface GenericMapper<T,R,E> {

    R toDto(E entity);

    void updateProductFromDto(T dto, @MappingTarget E entity);
    }


