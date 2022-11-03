package com.springbestpractice.springbestpractice.service;

import com.springbestpractice.springbestpractice.dto.ProductDto;
import com.springbestpractice.springbestpractice.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
  void save(ProductDto dto);

  void delete(int id);

  void update(int id, ProductDto dto);

  List<ProductDto> findAll();

  ProductDto findById(int id) throws ProductNotFoundException;
}
