package com.springbestpractice.springbestpractice.dto;

import com.springbestpractice.springbestpractice.entity.Category;
import lombok.Data;

@Data
public class ProductDto {
  private int id;

  private String name;

  private double price;
  private float rating;

  private Category category;
}
