package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    //제품 pk
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 제품명
    @Column(name = "product_name")
    private String productName;

    // 브랜드명
    @Column(name = "brand_name")
    private String brandName;

    // 모델명
    @Column(name = "model_number")
    private String modelNumber;

    // 상세설명
    @Column(name = "description")
    private String description;

    // 가격
    @Column(name = "price")
    private double price;

    // 카테고리
    @Column(name = "category")
    private String category;

    // 재고여부
    @Column(name = "availability")
    private boolean availability;

    // 색상
    @Column(name = "color")
    private String color;

    // 보증기간
    @Column(name = "warranty")
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
