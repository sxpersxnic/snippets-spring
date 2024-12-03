package com.snippets.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "username")
public class ProfileRequestDTO {

  @NotBlank(message = "Username must not be blank!")
  private String username;
  private String photo;

}