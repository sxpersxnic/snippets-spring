package com.snippets.api.dto.request;

import lombok.*;

@Getter
@Setter
@EqualsAndHashcode(of = "email")
public class SignInRequestDTO {

  @NotBlank(message = "Email must not be blank!")
  private String email;
  
  @NotBlank(message = "Password must not be blank!")
  private String password;

}