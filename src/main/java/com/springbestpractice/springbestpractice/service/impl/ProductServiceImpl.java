package com.springbestpractice.springbestpractice.service.impl;

import com.springbestpractice.springbestpractice.dto.ProductDto;
import com.springbestpractice.springbestpractice.mapper.ProductMapper;
import com.springbestpractice.springbestpractice.repository.ProductRepository;
import com.springbestpractice.springbestpractice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Cache;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
  private final ProductRepository repository;
  private final ProductMapper mapper;

  @Override
  public void save(ProductDto dto) {
    repository.save(mapper.toModel(dto));
  }

  @Override
  public void delete(int id) {
    repository.deleteById(id);
  }

  @Override
  public void update(int id, ProductDto dto) {
    repository.save(mapper.toModel(dto));
  }

  @Override
  public List<ProductDto> findAll() {
    ArrayList<ProductDto> result = new ArrayList<ProductDto>();
    var data = repository.findAll();

    data.forEach(d -> result.add(mapper.toDTO(d)));

    return result;
  }

  @Override
  public ProductDto findById(int id) {
    return mapper.toDTO(repository.findById(id).orElse(null));
  }

}
