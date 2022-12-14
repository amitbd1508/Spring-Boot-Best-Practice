package com.springbestpractice.springbestpractice.controller;

import com.springbestpractice.springbestpractice.dto.ProductDto;
import com.springbestpractice.springbestpractice.exception.ProductNotFoundException;
import com.springbestpractice.springbestpractice.service.ProductService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/products")
@Api( tags = "Products")
@RequiredArgsConstructor
public class ProductController {
  Logger log = LoggerFactory.getLogger(this.getClass());
  private final ProductService service;
  @GetMapping
  public ResponseEntity<List<ProductDto>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<ProductDto> findById(@PathVariable int id) throws ProductNotFoundException {
    return ResponseEntity.ok(service.findById(id));
  }

  @PostMapping
  public ResponseEntity<Void> save(@RequestBody @Valid ProductDto dto) {
    service.save(dto);
    log.info(dto.toString() + "is saved successfully");
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Void> update(@PathVariable int id, @RequestBody ProductDto dto) {
    service.update(id, dto);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable int id) {
    service.delete(id);
    log.info(id + "is deleted successfully");
    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
  }

  @GetMapping("/filter")
  public ResponseEntity<List<ProductDto>> filter(@RequestParam Map<String, String> args) {

    return ResponseEntity.ok(new ArrayList<ProductDto>());
  }
}
