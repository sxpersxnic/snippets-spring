package com.snippets.api.repository;

import com.snippets.api.model.Snippet;
import jakarta.persistence.LockModeType;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface SnippetRepository extends JpaRepository<Snippet, UUID> {

    @Query("SELECT s FROM Snippet s WHERE s.profile.id = :id")
    List<Snippet> findByAuthorId(UUID id);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @QueryHints({@QueryHint(name = "jakarta.persistence.lock.timeout", value = "0")})
    @Query("SELECT s FROM Snippet s WHERE s.id = :id")
    Optional<Snippet> findByIdForUpdate(UUID id);
}