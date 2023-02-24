package com.example.service;

import static org.junit.jupiter.api.Assertions.*;

import com.example.domain.Product;
import com.example.dto.ProductReqDto;
import com.example.dto.ProductResDto;
import com.example.mapper.ProductMapper;
import com.example.mapper.ProductMapperImpl;
import com.example.repository.ProductRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Rollback(value = true)
@Transactional
class ProductServiceTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    private ProductService productService;

    private ProductReqDto productReqDto;

    @BeforeEach
    void setup() {
        this.productMapper = new ProductMapperImpl();
        this.productService = new ProductServiceImpl(productRepository, productMapper);
        this.productReqDto = ProductReqDto.builder()
                                          .availability(true)
                                          .productName("i-phone 14")
                                          .price(500000.00)
                                          .color("black")
                                          .brandName("apple")
                                          .category("electronic")
                                          .description("아이폰")
                                          .modelNumber("153512351235")
                                          .warranty("1year")
                                          .build();
    }

    @DisplayName("제품 저장")
    @Test
    void createProduct() {

        String message = productService.createProduct(productReqDto);

        Assertions.assertThat(message)
                  .isEqualTo("저장 성공!");
    }

    @DisplayName("제품 조회")
    @Test
    void readAllProduct() {

        List<ProductResDto> productResDtos = productService.readAllProduct();

        System.out.println("----------------------------------------------");
        productResDtos.forEach(productResDto -> System.out.println(productResDto.toString()));
        System.out.println("----------------------------------------------");
    }

    @DisplayName("제품 수정")
    @Test
    void updateProduct() {
        productReqDto.setProductName("갤럭시 10");
        String str = productService.updateProduct(1L, productReqDto);

        System.out.println("str = " + str);
    }

    @DisplayName("제품 삭제")
    @Test
    void deleteProduct() {
        String result = productService.deleteProduct(3L);
        Assertions.assertThat(result).isEqualTo("삭제 성공!");
    }
}