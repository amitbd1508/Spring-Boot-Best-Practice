package com.springbestpractice.springbestpractice.advice;

import com.springbestpractice.springbestpractice.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandeler {

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public Map<String, String> handleInvalidArguments(MethodArgumentNotValidException ex) {
    Map<String, String> errorMap = new HashMap<>();
    ex.getBindingResult().getFieldErrors().forEach(error -> {
      errorMap.put(error.getField(), error.getDefaultMessage());
    });

    return errorMap;
  }

  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler(ProductNotFoundException.class)
  public Map<String, String> handleProductNotFoundException(ProductNotFoundException ex) {
    Map<String, String> errorMap = new HashMap<>();
    errorMap.put("error", ex.getMessage());
    return errorMap;


  }

}
