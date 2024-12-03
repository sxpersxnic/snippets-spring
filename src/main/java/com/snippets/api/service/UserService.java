package com.snippets.api.service;

import com.snippets.api.model.User;
import com.snippets.api.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService implements IService<User, UUID> {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(UUID uuid) {
        return userRepository.findById(uuid).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    @Transactional
    public User findByIdForUpdate(UUID uuid) {
        return userRepository.findById(uuid).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public User create(User entity) {
        String plainPassword = entity.getPassword();

        // After Security has been configured, maybe replace with encryptPassword
        String hashedPassword = BCrypt.hashpw(plainPassword, BCrypt.gensalt());
        entity.setPassword(hashedPassword);
        return userRepository.save(entity);
    }

    @Override
    public User update(User changing, UUID existing) {
        return null;
    }

    @Override
    public void delete(UUID uuid) {

    }

    @Override
    @Transactional
    public void merge(User existing, User changing) {

    }
}