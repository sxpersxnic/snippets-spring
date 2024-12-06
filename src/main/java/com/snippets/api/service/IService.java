package com.snippets.api.service;

import jakarta.transaction.Transactional;

import java.util.List;

public interface IService<E, ID> {
    public List<E> findAll();
    public E findById(ID id);
    public E findByIdForUpdate(ID id);
    public E create(E e);
    public E update(E changing, ID id);
    public void delete(ID id);
    void merge(E existing, E changing);
}
