package com.example.controller;

import com.example.dto.ProductReqDto;
import java.util.List;

public interface ProductController<T,R> {

    String registerProduct(T dto);

    List<R> inquireProduct();

    String modifyProduct(ProductReqDto dto);

    String deleteProduct(Long id);

}
