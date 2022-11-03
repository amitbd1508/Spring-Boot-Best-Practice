package com.springbestpractice.springbestpractice.mapper;

import com.springbestpractice.springbestpractice.dto.ProductDto;
import com.springbestpractice.springbestpractice.entity.Product;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductMapper {
  private final ModelMapper modelMapper;

  public ProductDto toDTO(Product product) {
    return modelMapper.map(product, ProductDto.class);
  }

  public Product toModel(ProductDto dto) {
    return modelMapper.map(dto, Product.class);
  }
}
