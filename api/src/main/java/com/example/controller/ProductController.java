package com.example.controller;

import com.example.dto.ProductReqDto;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProductController<T,R> {

    String registerProduct(@RequestBody T dto);

    //readAll
    List<R> readAllProducts();

    //readOne
    R readProduct(Long id);

    String modifyProduct(@PathVariable Long id, @RequestBody T dto);

    String deleteProduct(@PathVariable Long id);

}
