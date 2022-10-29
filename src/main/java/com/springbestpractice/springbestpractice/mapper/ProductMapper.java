package com.springbestpractice.springbestpractice.mapper;

import com.springbestpractice.springbestpractice.dto.ProductDto;
import com.springbestpractice.springbestpractice.entity.Item;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductMapper {
  private final ModelMapper modelMapper;

  public ProductDto toDTO(Item item) {
    return modelMapper.map(item, ProductDto.class);
  }

  public Item toModel(ProductDto dto) {
    return modelMapper.map(dto, Item.class);
  }
}
