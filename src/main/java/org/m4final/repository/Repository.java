package org.m4final.repository;

import org.m4final.entity.City;

import java.util.List;

public interface Repository<T> {
    public List<T> getItems(int offset, int limit);

    public int getTotalCount();

    public T getById(final int id);

    public List<T> findAll();

    public T save(final T entity);

    public T update(final T entity);

    public void delete(final T entity);

    public void deleteById(final int entityId);

}
