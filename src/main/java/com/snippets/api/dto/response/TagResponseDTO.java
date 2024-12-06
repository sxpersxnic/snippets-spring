package com.snippets.api.dto.response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "name")
public class TagResponseDTO {
    private UUID id;
    private UUID authorId;

    private String name;
    private String color;

    private List<UUID> snippetIds;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}