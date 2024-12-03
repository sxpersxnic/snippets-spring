package com.snippets.api.dto.request;

import lombok.*;

@Getter
@Setter
@EqualsAndHashcode(of = "email")
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