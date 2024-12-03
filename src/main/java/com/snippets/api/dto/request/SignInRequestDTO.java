package com.snippets.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "email")
public class SignInRequestDTO {

  @NotBlank(message = "Email must not be blank!")
  private String email;
  
  @NotBlank(message = "Password must not be blank!")
  private String password;

}