package com.springbestpractice.springbestpractice.dto;

import com.springbestpractice.springbestpractice.entity.Category;
import com.springbestpractice.springbestpractice.validation.ValidateProductType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Schema(description = "Product Dto")
public class ProductDto {
  private int id;

  @NotNull(message = "User name should not be null")
  @Length(min = 3)
  private String name;

  @NotNull
  @Min(value = 1, message = "Price cannot be less than 1")
  @Max(value = 2000, message = "Price cannot be more than 2000")
  private double price;
  @NotNull
  @Min(0)
  @Max(5)
  private float rating;

  @ValidateProductType
  private String productType;

  //private Category category;
}
