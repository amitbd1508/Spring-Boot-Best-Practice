package com.springbestpractice.springbestpractice.dto;

import com.springbestpractice.springbestpractice.entity.Product;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "User Dto")
public class CategoryDto {
  private int id;

  private String name;
  private List<Product> products;
}
