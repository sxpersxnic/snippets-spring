package com.snippets.api.dto.request;

import lombok.*;

@Getter
@Setter
@EqualsAndHashcode(of = "username")
public class ProfileRequestDTO {

  @NotBlank(message = "Username must not be blank!")
  private String username;

  private String photo;

}