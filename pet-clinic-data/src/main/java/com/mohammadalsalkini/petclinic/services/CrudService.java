package com.mohammadalsalkini.petclinic.services;

import java.util.Set;

/**
 * @author Mohammad Alsalkini
 * @project pet-clinic
 * @created 17.04.2020 - 22:25
 */
public interface CrudService<T, ID>  {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete (T object);

    void deleteById(ID id);
}
