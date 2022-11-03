package com.springbestpractice.springbestpractice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;

  @JoinTable(name = "category_items")
  @ManyToMany
  List<Product> product;
}
