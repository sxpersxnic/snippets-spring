package com.snippets.api.model;

import jakarta.persistence.*;
import lombok.*;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.*;

@Getter
@Setter
@EqualsAndHashCode(of = "name")
@Table(name = "tags")
@Entity
public class Tag {

  @Id 
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id", nullable = false, unique = true)
  private UUID id;

  @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
  @JoinColumn(name = "author_id")
  private Profile profile;

  @ManyToMany(mappedBy = "tags", fetch = FetchType.LAZY)
  private Set<Snippet> snippets;
  
  @Column(name = "name", nullable = false)
  private String name;
  
  @Column(name = "color", nullable = false)
  private String color;
  
  @Column(name = "created_at", insertable = false, updatable = false)
  private LocalDateTime createdAt;
  
  @Column(name = "updated_at", insertable = false)
  private LocalDateTime updatedAt;

}