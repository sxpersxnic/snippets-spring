package com.snippets.api.dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "name")
public class TagRequestDTO {

  @NotBlank(message = "Name must not be blank!")
  private String name;

  private String color;
  
}