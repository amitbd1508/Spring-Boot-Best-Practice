package com.springbestpractice.springbestpractice.repository;

import com.springbestpractice.springbestpractice.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
