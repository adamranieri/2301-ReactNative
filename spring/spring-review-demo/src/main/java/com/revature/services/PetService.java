package com.revature.services;

import com.revature.entities.Pet;
import com.revature.exceptions.PetNotFoundException;


public interface PetService {

    public Pet upsert(Pet pet);
    public Pet getById(Long id) throws PetNotFoundException;
}
