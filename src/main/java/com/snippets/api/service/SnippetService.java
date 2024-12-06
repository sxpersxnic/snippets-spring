package com.snippets.api.service;

import com.snippets.api.lib.exceptions.FailedValidationException;
import com.snippets.api.model.Snippet;
import com.snippets.api.repository.SnippetRepository;
import com.snippets.api.service.ItemService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SnippetService implements ItemService<Snippet, UUID> {

    private final SnippetRepository snippetRepository;

    public SnippetService(SnippetRepository snippetRepository) {
        this.snippetRepository = snippetRepository;
    }


    @Override
    public List<Snippet> findAll() {
        return snippetRepository.findAll();
    }

    @Override
    public List<Snippet> findByAuthorId(UUID id) {
        return snippetRepository.findByAuthorId(id);
    }

    @Override
    public Snippet findById(UUID id) {
        return snippetRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    @Transactional
    public Snippet findByIdForUpdate(UUID id) {
        return snippetRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Snippet create(Snippet snippet) {
        return snippetRepository.save(snippet);
    }

    @Override
    @Transactional
    public Snippet update(Snippet changing, UUID existingId) {
        Snippet existing = findById(existingId);
        merge(existing, changing);

        return existing;
    }

    @Override
    public void delete(UUID id) {
        snippetRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void merge(Snippet existing, Snippet changing) {
        Map<String, List<String>> errors = new HashMap<>();

        if (changing.getTitle() != null) {
            if (StringUtils.isNotBlank(changing.getTitle())) {
                existing.setTitle(changing.getTitle());
            } else {
                errors.put("Title", List.of("Title must not be empty!"));
            }
        }

        if (changing.getContent() != null) {
            if (StringUtils.isNotBlank(changing.getContent())) {
                existing.setContent(changing.getContent());
            } else {
                errors.put("Content", List.of("Content must not be empty!"));
            }
        }

        if (changing.getLanguage() != null) {
          if (StringUtils.isNotBlank(changing.getLanguage())) {
              existing.setLanguage(changing.getLanguage());
          } else {
              errors.put("Language", List.of("Language must not be empty!"));
          }
        }

        if (!errors.isEmpty()) {
            throw new FailedValidationException(errors);
        }
    }
}