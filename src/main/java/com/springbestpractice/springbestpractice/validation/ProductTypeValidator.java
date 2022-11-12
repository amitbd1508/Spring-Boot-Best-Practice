package com.springbestpractice.springbestpractice.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductTypeValidator implements ConstraintValidator<ValidateProductType,String> {
  @Override
  public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
    return false;
  }
}
