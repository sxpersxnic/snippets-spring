package com.snippets.api.repository;

import com.snippets.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AuthRepository extends JpaRepository<User, UUID> {

    @Query("SELECT u FROM User u WHERE u.id = (SELECT p.user.id FROM Profile p WHERE p.id = :id )")
    Optional<User> findUserByProfileId(UUID id);
}