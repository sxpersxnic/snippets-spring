package com.snippets.api.mapper;

import com.snippets.api.dto.request.UserRequestDTO;
import com.snippets.api.dto.response.UserResponseDTO;
import com.snippets.api.model.User;

public class UserMapper {
    public static UserResponseDTO toDTO(User src) {
        UserResponseDTO dto = new UserResponseDTO();

        dto.setId(src.getId());
        dto.setEmail(src.getEmail());

        return dto;
    }

    public static User fromDTO(UserRequestDTO dto) {
        User user = new User();

        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        return user;
    }
}