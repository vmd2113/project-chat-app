package com.project.chatapp.common.base;

import java.util.List;

public interface BaseService <T, Repository, ID>{
    public Repository getRepository();

    public T findById(ID id);

    public List<T> findAll();

    public T update(T entity);

    public T add(T entity);

    public void deleteById(ID id);
}
