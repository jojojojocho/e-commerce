package com.example.controller;

import com.example.dto.ProductReqDto;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProductController<T,R> {

    String registerProduct(@RequestBody T dto);

    List<R> inquireProduct();

    String modifyProduct(@PathVariable Long id, @RequestBody ProductReqDto dto);

    String deleteProduct(@PathVariable Long id);

}
