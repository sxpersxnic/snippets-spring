package com.snippets.api.mapper;

import com.snippets.api.dto.request.SignInRequestDTO;
import com.snippets.api.dto.response.SignInResponseDTO;
import com.snippets.api.model.Profile;
import com.snippets.api.model.User;

public class SignInMapper {
    public static SignInResponseDTO toDTO(User user, Profile profile, String token) {
        SignInResponseDTO dto = new SignInResponseDTO();

        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setUsername(profile.getUsername());
        dto.setToken(token);

        return dto;
    }

    public static User fromDTO(SignInRequestDTO dto) {
        User user = new User();

        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        return user;
    }
}