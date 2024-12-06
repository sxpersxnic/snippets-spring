package com.snippets.api.service;

import com.snippets.api.lib.exceptions.FailedValidationException;
import com.snippets.api.model.Profile;
import com.snippets.api.repository.ProfileRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ProfileService implements IService<Profile, UUID> {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    @Override
    public Profile findById(UUID id) {
        return profileRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Profile findByIdForUpdate(UUID id) {
        return profileRepository.findByIdForUpdate(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Profile create(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    @Transactional
    public Profile update(Profile changing, UUID id) {
        Profile existing = findByIdForUpdate(id);
        merge(existing, changing);

        return existing;
    }

    @Override
    public void delete(UUID uuid) {
        profileRepository.deleteById(uuid);
    }

    @Override
    @Transactional
    public void merge(Profile existing, Profile changing) {
        Map<String, List<String>> errors = new HashMap<>();

        if (changing.getPhoto() != null) {
            if (StringUtils.isNotBlank(changing.getPhoto())) {
                existing.setPhoto(changing.getPhoto());
            } else {
                existing.setDefaultPhoto();
            }
        }

        if (changing.getUsername() != null) {
            if (StringUtils.isNotBlank(changing.getUsername())) {
                existing.setUsername(changing.getUsername());
            } else {
                errors.put("Username", List.of("Username must not be empty!"));
            }
        }

        if (!errors.isEmpty()) {
            throw new FailedValidationException(errors);
        }
    }
}