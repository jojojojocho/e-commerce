package com.example.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;

//@Entity
@Getter
@Builder
public class ProductReview {
//
//    // pk
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    // 리뷰내용
//    @Column(name = "review_text")
//    private String reviewText;
//
//    // 점수
//    @Column(name = "rating")
//    private int rating;
//
//    // 리뷰 사진
//    @OneToMany(mappedBy = "productReview")
//    private List<Image> reviewImage;
//
//    // 제품
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private Product product;
}
