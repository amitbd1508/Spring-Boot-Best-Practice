package com.springbestpractice.springbestpractice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Item {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;

  private double price;
  private float rating;

  @ManyToMany(mappedBy = "item") // will not create item_category
  private List<Category> category;

  @JoinTable(name = "item_comment")
  @OneToMany
  List<Comment> comment;

  @JoinColumn(name = "id_user")
  @ManyToOne
  private User user;
}
