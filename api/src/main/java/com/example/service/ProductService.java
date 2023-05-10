package com.example.service;


import com.example.dto.ProductResDto;
import java.util.List;

public interface ProductService<T,R> {

    String createProduct(T reqDto);

    List<R> readAllProducts();

    R readProduct(Long id);

    String updateProduct(Long id, T reqDto);

    String deleteProduct(Long id);
}
