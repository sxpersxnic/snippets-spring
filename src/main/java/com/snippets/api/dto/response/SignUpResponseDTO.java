package com.snippets.api.dto.response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "email")
public class SignUpResponseDTO {
    private UUID id;

    private String email;
    private String username;
}