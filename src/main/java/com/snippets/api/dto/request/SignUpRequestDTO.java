package com.snippets.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "email")
public class SignUpRequestDTO {

  @NotBlank(message = "Username must not be blank!")
  private String username;

  @Email
  @NotBlank(message = "Email must not be blank!")
  private String email;
  
  @NotBlank(message = "Password must not be blank!")
  @Min(value = 8, message = "Password must be at least 8 characters long!")
  private String password;

}