package it.epicode.Catalogo.Dao;

import java.util.List;


public interface GenericDao<T> {
    void save(T t);

    void delete(T t);

    T findById(Object id);

    List<T> findAll();
}