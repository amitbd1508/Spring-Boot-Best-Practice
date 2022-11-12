package com.springbestpractice.springbestpractice.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ProductTypeValidator.class)
public @interface ValidateProductType {

  public String message() default "Invalid product type: It should be either Physical or Non-Physical";
  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
