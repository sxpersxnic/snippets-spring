package com.snippets.api.model;

import jakarta.persistence.*;
import lombok.*;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.*;

@Getter
@Setter
@EqualsAndHashcode(of = "title")
@Entity
public class Tag {

  @Id 
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id", nullable = false, unique = true)
  private UUID id;

  @ManyToOne
  @JoinColumn(name = "author_id")
  private Profile profile;

  @ManyToMany
  @JoinTable(name = "snippet_tags", joinCloumns = @JoinColumn(name = "snippet_id"), inverseJoinColumns = @JoinColumn(name = "tag_id"))
  private Set<Tag> tags = new LinkedHashSet<>();
  
  @Column(name = "title", nullable = false)
  private String title;
  
  @Column(name = "content", nullable = false)
  private String content;
  
  @Column(name = "language", nullable = false)
  private String language;
  
  @Column(name = "created_at", insertAble = false)
  private LocalDateTime createdAt;
  
  @Column(name = "updated_at", insertAble = false)
  private LocalDateTime updatedAt;

}