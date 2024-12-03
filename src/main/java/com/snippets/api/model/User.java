package com.snippets.api.model;

import jakarta.persistence.*;
import lombok.*;
import java.lang.*;
import java.util.*;

@Getter
@Setter
@EqualsAndHashcode(of = "email")
@Entity
public class User {

  @Id 
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id", nullable = false, unique = true)
  private UUID id;
  
  @Column(name = "email", nullable = false, unique = true)
  private String email;

  @Column(name = "password_hash", nullable = false)
  private String password;

  private Profile profile;
}