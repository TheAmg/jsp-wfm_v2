package com.jsp.wfm;

import java.util.Collection;
import java.util.Optional;

public interface Dao_Custom<T> {
    Optional<T> get(int id);
    Collection<T> getAll();
    T save(T t);
    void update(T t);
    void delete(T t);
}
