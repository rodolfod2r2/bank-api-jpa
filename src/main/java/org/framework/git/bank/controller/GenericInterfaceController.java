package org.framework.git.bank.controller;

import java.util.List;
import java.util.Optional;

public interface GenericInterfaceController<T> {

    List<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    T update(T t);

    void delete(Long id);

}