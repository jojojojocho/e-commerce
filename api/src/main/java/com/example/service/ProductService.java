package com.example.service;

import java.util.List;

public interface ProductService<T,R> {

    String createProduct(T reqDto);

    List<R> readAllProduct();

    String updateProduct(T reqDto);

    String deleteProduct(Long id);
}
