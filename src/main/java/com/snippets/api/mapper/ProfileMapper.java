package com.snippets.api.mapper;

import com.snippets.api.dto.request.ProfileRequestDTO;
import com.snippets.api.dto.response.ProfileResponseDTO;
import com.snippets.api.model.Profile;
import com.snippets.api.model.Snippet;
import com.snippets.api.model.Tag;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ProfileMapper {

    public static ProfileResponseDTO toDTO(Profile src) {
        ProfileResponseDTO dto = new ProfileResponseDTO();

        dto.setId(src.getId());
        dto.setUserId(src.getUser().getId());

        List<UUID> snippetIds = src.getSnippets().stream().map(Snippet::getId).toList();
        List<UUID> tagIds = src.getTags().stream().map(Tag::getId).toList();

        dto.setSnippetIds(snippetIds);
        dto.setTagIds(tagIds);

        dto.setUsername(src.getUsername());
        dto.setCreatedAt(src.getCreatedAt());
        dto.setUpdatedAt(src.getUpdatedAt());

        return dto;
    }

    public static Profile fromDTO(ProfileRequestDTO dto) {
        Profile profile = new Profile();

        profile.setUsername(dto.getUsername());
        profile.setPhoto(dto.getPhoto());

        return profile;
    }
}