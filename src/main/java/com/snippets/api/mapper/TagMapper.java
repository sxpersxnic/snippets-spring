package com.snippets.api.mapper;

import com.snippets.api.dto.request.TagRequestDTO;
import com.snippets.api.dto.response.TagResponseDTO;
import com.snippets.api.model.Profile;
import com.snippets.api.model.Snippet;
import com.snippets.api.model.Tag;

import java.util.*;
import java.util.stream.Collectors;

public class TagMapper {

    public static TagResponseDTO toDTO(Tag src) {
        TagResponseDTO dto = new TagResponseDTO();

        dto.setId(src.getId());
        dto.setSnippetIds(
                src.getSnippets()
                   .stream()
                   .map(Snippet::getId)
                   .toList()
        );

        dto.setAuthorId(src.getProfile().getId());
        dto.setName(src.getName());
        dto.setColor(src.getColor());
        dto.setCreatedAt(src.getCreatedAt());
        dto.setUpdatedAt(src.getUpdatedAt());

        return dto;
    }

    public static Tag fromDTO(TagRequestDTO dto) {
        Tag tag = new Tag();

        tag.setName(dto.getName());
        tag.setColor(dto.getColor());

        return tag;
    }
}