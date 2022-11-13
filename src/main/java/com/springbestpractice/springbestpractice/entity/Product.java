package com.springbestpractice.springbestpractice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;

  private double price;
  private float rating;


  private String productType;
}
