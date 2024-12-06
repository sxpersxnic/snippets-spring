package com.snippets.api.service;

import com.snippets.api.lib.exceptions.FailedValidationException;
import com.snippets.api.model.Tag;
import com.snippets.api.repository.TagRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class TagService implements ItemService<Tag, UUID> {

    private final TagRepository tagRepository;

    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    @Override
    public List<Tag> findByAuthorId(UUID authorId) {
        return tagRepository.findByAuthorId(authorId);
    }

    @Override
    public Tag findById(UUID uuid) {
        return tagRepository.findById(uuid).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    @Transactional
    public Tag findByIdForUpdate(UUID uuid) {
        return tagRepository.findByIdForUpdate(uuid).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Tag create(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    @Transactional
    public Tag update(Tag changing, UUID existingId) {
        Tag existing = findById(existingId);
        merge(existing, changing);

        return existing;
    }

    @Override
    public void delete(UUID uuid) {
        tagRepository.deleteById(uuid);
    }

    @Override
    @Transactional
    public void merge(Tag existing, Tag changing) {
        Map<String, List<String>> errors = new HashMap<>();

        if (changing.getName() != null) {
            if (StringUtils.isNotBlank(changing.getName())) {
                existing.setName(changing.getName());
            } else {
                errors.put("Name", List.of("Name of Tag must not be empty!"));
            }
        }

        if (changing.getColor() != null) {
            existing.setColor(changing.getColor());
        }

        if (!errors.isEmpty()) {
            throw new FailedValidationException(errors);
        }
    }
}