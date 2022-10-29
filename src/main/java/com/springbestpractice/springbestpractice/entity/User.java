package com.springbestpractice.springbestpractice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;

  private String email;

  private String password;

  private String firstName;

  private String lastName;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<Address> address;

  @OneToMany(mappedBy = "user")
  private List<Comment> comments;

  @OneToMany(mappedBy = "user")
  private List<Item> items;
}
