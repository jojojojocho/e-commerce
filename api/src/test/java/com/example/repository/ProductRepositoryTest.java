package com.example.repository;

import com.example.domain.Product;
import com.example.dto.ProductReqDto;
import com.example.mapper.ProductMapper;
import com.example.mapper.ProductMapperImpl;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;


@SpringBootTest
@Transactional
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    private Product product;

    //    @Autowired
    ProductMapper productMapper = new ProductMapperImpl();


    @BeforeEach
    void setup() {
//        this.productMapper = new ProductMapperImpl();
        this.product = Product.builder()
                                    .availability(true)
                                    .productName("i-phone 15")
                                    .price(500000.00)
                                    .color("black")
                                    .brandName("apple")
                                    .category("electronic")
                                    .description("아이폰")
                                    .modelNumber("153512351235")
                                    .warranty("1year")
                                    .build();
        productRepository.save(product);
    }

//    @Test
//    @DisplayName("제품 저장")
//    public void saveProduct() {
//        // given
//        Product product = productMapper.toEntity(productReqDto);
//        // when
//        Product save = productRepository.save(product);
//        // then
////        System.out.println(save.toString());
//        Assertions.assertThat(save.getProductName()).isEqualTo("i-phone 15");
//    }

    @Test
    @DisplayName("모든 제품 조회")
    public void readProduct() {
        List<Product> all = productRepository.findAll();

//        System.out.println(all.toString());
        Assertions.assertThat(all.size())
                  .isEqualTo(1);
    }


}