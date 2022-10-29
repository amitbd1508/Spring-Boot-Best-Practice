package com.springbestpractice.springbestpractice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "User Dto")
public class ReviewDto {
  private int id;
  private String comment;

  private int userId;

}
