package com.snippets.api.dto.response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "email")
public class SignInResponseDTO {
    private UUID id;

    private String email;
    private String username;
    private String token;

}