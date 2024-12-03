package com.snippets.api.dto.response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "username")
public class ProfileResponseDTO {
    private UUID id;
    private UUID userId;

    private String username;
    private String photo;

    private List<UUID> snippetIds;
    private List<UUID> tagIds;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}