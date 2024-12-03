package com.snippets.api.dto.request;

import lombok.*;

@Getter
@Setter
@EqualsAndHashcode(of = "email")
public class SnippetRequestDTO {

  @NotBlank(message = "Title must not be blank!")
  private String title;

  @NotBlank(message = "Content must not be blank!")
  private String content;

  @NotBlank(message = "Language must not be blank!")
  private String language;
  
}