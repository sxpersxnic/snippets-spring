package com.snippets.api.dto.request;

import lombok.*;

@Getter
@Setter
@EqualsAndHashcode(of = "email")
public class TagRequestDTO {

  @NotBlank(message = "Name must not be blank!")
  private String name;

  private String color;
  
}