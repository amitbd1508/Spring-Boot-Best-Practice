package com.springbestpractice.springbestpractice.mapper;

import com.springbestpractice.springbestpractice.dto.ReviewDto;
import com.springbestpractice.springbestpractice.entity.Comment;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewMapper {
  private final ModelMapper modelMapper;

  public ReviewDto toDTO(Comment model) {
    return modelMapper.map(model, ReviewDto.class);
  }

  public Comment toModel(ReviewDto dto) {
    return modelMapper.map(dto, Comment.class);
  }
}
