package com.snippets.api.mapper;

import com.snippets.api.dto.request.SnippetRequestDTO;
import com.snippets.api.dto.response.SnippetResponseDTO;
import com.snippets.api.model.Snippet;
import com.snippets.api.model.Tag;

public class SnippetMapper {
    public static SnippetResponseDTO toDTO(Snippet src) {
        SnippetResponseDTO dto = new SnippetResponseDTO();

        dto.setId(src.getId());
        dto.setTagIds(
                src.getTags()
                   .stream()
                   .map(Tag::getId)
                   .toList()
        );

        dto.setAuthorId(src.getProfile().getId());
        dto.setTitle(src.getTitle());
        dto.setContent(src.getContent());
        dto.setLanguage(src.getLanguage());
        dto.setCreatedAt(src.getCreatedAt());
        dto.setUpdatedAt(src.getUpdatedAt());

        return dto;
    }

    public static Snippet fromDTO(SnippetRequestDTO dto) {
        Snippet snippet = new Snippet();

        snippet.setTitle(dto.getTitle());
        snippet.setContent(dto.getContent());
        snippet.setLanguage(dto.getLanguage());

        return snippet;
    }
}