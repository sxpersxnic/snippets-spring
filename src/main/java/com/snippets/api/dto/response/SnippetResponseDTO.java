package com.snippets.api.dto.response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "title")
public class SnippetResponseDTO {
    private UUID id;
    private UUID authorId;

    private String title;
    private String content;
    private String language;
    private List<UUID> tagIds;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}