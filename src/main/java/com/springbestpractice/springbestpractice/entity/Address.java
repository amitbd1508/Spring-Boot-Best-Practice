package com.springbestpractice.springbestpractice.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String street;
  private String zip;
  private String city;

  @JoinColumn(name = "id_user")
  @ManyToOne
  private User user;
}
