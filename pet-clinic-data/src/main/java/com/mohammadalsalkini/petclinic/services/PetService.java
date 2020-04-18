package com.mohammadalsalkini.petclinic.services;

import com.mohammadalsalkini.petclinic.model.Owner;
import com.mohammadalsalkini.petclinic.model.Pet;

import java.util.Set;

/**
 * @author Mohammad Alsalkini
 * @project pet-clinic
 * @created 17.04.2020 - 17:36
 */
public interface PetService extends CrudService<Pet, Long>{

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
