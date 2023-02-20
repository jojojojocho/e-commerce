package com.example.service;

import com.example.domain.Product;
import com.example.dto.ProductReqDto;
import com.example.dto.ProductResDto;
import com.example.mapper.ProductMapper;
import com.example.repository.ProductRepository;
import java.util.List;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService<ProductReqDto, ProductResDto> {

    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    @Override
    public String createProduct(ProductReqDto productReqDto) {
        try {
            Product product = new Product();
            mapper.updateProductFromDto(productReqDto, product);
            productRepository.save(product);
            return "저장 성공!";
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return "저장 실패!";
        }

    }

    @Override
    public List<ProductResDto> readAllProduct() {
        List<Product> products = productRepository.findAll();
        List<ProductResDto> productResDtos = products.stream()
                                                     .map(product -> mapper.toDto(product))
                                                     .toList();
        return productResDtos;

    }

    @Override
    public String updateProduct(ProductReqDto dto) {
        Product product = productRepository.findById(dto.getId())
                                           .orElseGet(null);
        if (product != null) {
            mapper.updateProductFromDto(dto, product);
            return "수정 성공!";
        }
        return "대상이 없습니다.";
    }

    @Override
    public String deleteProduct(Long id) {
        Product product = productRepository.findById(id)
                                           .orElseGet(null);
        if (product != null) {
            productRepository.delete(product);
            return "삭제 성공!";
        }
        return "대상이 없습니다.";
    }

}
