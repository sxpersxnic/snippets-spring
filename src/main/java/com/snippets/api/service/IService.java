package com.snippets.api.service;

import jakarta.transaction.Transactional;

import java.util.List;

public interface IService<E, ID> {
    public List<E> findAll();
    public E findById(ID id);

    @Transactional
    public E findByIdForUpdate(ID id);
    public E create(E entity);
    public E update(E changing, ID existing);
    public void delete(ID id);

    @Transactional
    void merge(E existing, E changing);
}
