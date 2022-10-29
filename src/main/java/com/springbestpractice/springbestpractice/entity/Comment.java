package com.springbestpractice.springbestpractice.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String comment;

  @ManyToOne
  Item item;

  @JoinColumn(name = "id_user")
  @ManyToOne
  User user;
}
