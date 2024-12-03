package com.snippets.api.model;

import jakarta.persistence.*;
import lombok.*;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.*;

@Getter
@Setter
@EqualsAndHashCode(of = "username")
@Table(name = "profiles")
@Entity
public class Profile {

  @Id 
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id", nullable = false, unique = true)
  private UUID id;

  @OneToOne
  @JoinColumn(name = "user_id")
  private User user;

  @OneToMany(mappedBy = "profile")
  private Set<Snippet> snippets = new LinkedHashSet<>();

  @OneToMany(mappedBy = "profile")
  private Set<Tag> tags = new LinkedHashSet<>();
  
  @Column(name = "username", nullable = false, unique = true)
  private String username;
  
  @Column(name = "photo")
  private String photo;
  
  @Column(name = "created_at", insertable = false, updatable = false)
  private LocalDateTime createdAt;
  
  @Column(name = "updated_at", insertable = false)
  private LocalDateTime updatedAt;

}