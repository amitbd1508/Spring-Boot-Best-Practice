package com.springbestpractice.springbestpractice.mapper;

import com.springbestpractice.springbestpractice.dto.CategoryDto;
import com.springbestpractice.springbestpractice.entity.Category;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryMapper {
  private final ModelMapper modelMapper;

  public CategoryDto toDTO(Category model) {
    return modelMapper.map(model, CategoryDto.class);
  }

  public Category toModel(CategoryDto dto) {
    return modelMapper.map(dto, Category.class);
  }
}
