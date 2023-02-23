package com.example.dto;

import com.example.domain.Image;
import com.example.domain.Product;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductReviewDto {

    // pk
    private Long id;

    // 리뷰내용
    private String reviewText;

    // 점수
    private int rating;

    // 리뷰 사진
    private List<Image> reviewImage;

    // 제품
    private Product product;

}
