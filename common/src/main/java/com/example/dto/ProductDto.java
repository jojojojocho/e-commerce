package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

    //제품 pk
    private Long id;

    // 제품명
    private String productName;

    // 브랜드명
    private String brandName;

    // 모델명
    private String modelNumber;

    // 상세설명
    private String description;

    // 가격
    private double price;

    // 카테고리
    private String category;

    // 재고여부
    private boolean availability;

    // 색상
    private String color;

    // 보증기간
    private String warranty;
//
//    // 이미지
//    @OneToMany(mappedBy = "product")
//    private List<Image> images;
//
//    // 상품리뷰
//    @OneToMany(mappedBy = "product")
//    private List<ProductReview> productReviews;

}
