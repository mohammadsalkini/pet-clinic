package com.mohammadalsalkini.petclinic.services;

import com.mohammadalsalkini.petclinic.model.Owner;

import java.util.Set;

/**
 * @author Mohammad Alsalkini
 * @project pet-clinic
 * @created 17.04.2020 - 17:34
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
