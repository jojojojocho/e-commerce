package com.example.dto;

import com.example.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageReqDto {

    // pk
    private Long id;

    // 사진
    private byte[] picture;

    // 제품
    private Product product;
}
