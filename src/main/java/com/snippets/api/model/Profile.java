package com.snippets.api.model;

import jakarta.persistence.*;
import lombok.*;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.*;

@Getter
@Setter
@EqualsAndHashcode(of = "username")
@Entity
public class Profile {

  @Id 
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id", nullable = false, unique = true)
  private UUID id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  
  @Column(name = "username", nullable = false, unique = true)
  private String username;
  
  @Column(name = "photo")
  private String photo;
  
  @Column(name = "created_at", insertAble = false)
  private LocalDateTime createdAt;
  
  @Column(name = "updated_at", insertAble = false)
  private LocalDateTime updatedAt;

}