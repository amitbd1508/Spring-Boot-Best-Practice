package com.springbestpractice.springbestpractice.dto;

import com.springbestpractice.springbestpractice.entity.Item;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "User Dto")
public class CategoryDto {
  private int id;

  private String name;
  private List<Item> items;
}
