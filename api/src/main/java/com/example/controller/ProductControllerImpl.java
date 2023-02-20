package com.example.controller;

import com.example.dto.ProductReqDto;
import com.example.dto.ProductResDto;
import com.example.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductControllerImpl implements ProductController<ProductReqDto, ProductResDto> {

    private final ProductService productService;

    // create
    @PostMapping("/")
    @Override
    public String registerProduct(ProductReqDto dto) {
        return productService.createProduct(dto);
    }

    // read
    @GetMapping("/")
    @Override
    public List<ProductResDto> inquireProduct() {
        return productService.readAllProduct();

    }

    // update
    @PutMapping("/{id}")
    @Override
    public String modifyProduct(ProductReqDto dto) {
        return productService.updateProduct(dto);
    }

    // delete
    @DeleteMapping("/{id}")
    @Override
    public String deleteProduct(@PathVariable Long id) {
        return productService.deleteProduct(id);
    }


}
