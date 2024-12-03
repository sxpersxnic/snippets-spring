package com.snippets.api.dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "title")
public class SnippetRequestDTO {

  @NotBlank(message = "Title must not be blank!")
  private String title;

  @NotBlank(message = "Content must not be blank!")
  private String content;

  @NotBlank(message = "Language must not be blank!")
  private String language;
  
}