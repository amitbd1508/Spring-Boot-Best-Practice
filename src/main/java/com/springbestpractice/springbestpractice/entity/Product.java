package com.springbestpractice.springbestpractice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;

  private double price;
  private float rating;

//  @ManyToMany(mappedBy = "product") // will not create item_category
//  private List<Category> category;
}
