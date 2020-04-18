package com.mohammadalsalkini.petclinic.services;

import com.mohammadalsalkini.petclinic.model.Owner;
import com.mohammadalsalkini.petclinic.model.Pet;
import com.mohammadalsalkini.petclinic.model.Vet;

import java.util.Set;

/**
 * @author Mohammad Alsalkini
 * @project pet-clinic
 * @created 17.04.2020 - 17:36
 */
public interface VetService extends CrudService<Vet, Long>{

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
