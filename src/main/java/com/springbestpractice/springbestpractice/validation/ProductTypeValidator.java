package com.springbestpractice.springbestpractice.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ProductTypeValidator implements ConstraintValidator<ValidateProductType,String> {
  @Override
  public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
    List<String> productTypes = Arrays.asList("Physical", "Non-Physical");
    return productTypes.contains(s);
  }
}
