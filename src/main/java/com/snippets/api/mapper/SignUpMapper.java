package com.snippets.api.mapper;

import com.snippets.api.dto.request.SignUpRequestDTO;
import com.snippets.api.dto.response.SignUpResponseDTO;
import com.snippets.api.model.Profile;
import com.snippets.api.model.User;

public class SignUpMapper {

    public static SignUpResponseDTO toDTO(User src, Profile profile) {
        SignUpResponseDTO dto = new SignUpResponseDTO();

        dto.setId(src.getId());
        dto.setEmail(src.getEmail());
        dto.setUsername(profile.getUsername());

        return dto;
    }

    public static User fromDTO(SignUpRequestDTO dto) {
        User user = new User();

        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        return user;
    }
}