package com.snippets.api.service;

import java.util.List;

public interface ItemService<E, ID> extends IService<E, ID> {
    List<E> findByAuthorId(ID id);
}
