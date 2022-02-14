package com.training.paradise.dao;

import java.util.List;

public interface CrudGenericDao <ID, T> {
    ID create(T object);
    T findById(ID id);
    boolean update(T object);
    boolean remove(T object);
    List<T> findAll();
}
