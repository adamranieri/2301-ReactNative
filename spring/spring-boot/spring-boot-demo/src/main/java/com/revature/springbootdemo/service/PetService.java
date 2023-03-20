package com.revature.springbootdemo.service;

import com.revature.springbootdemo.entity.Pet;
import com.revature.springbootdemo.exceptions.NameAlreadyExistsException;

import java.util.List;

public interface PetService {
    Pet insert(Pet pet) throws NameAlreadyExistsException;
    Pet getById(Long id);
    List<Pet> getAll();
    Pet update(Pet pet);
    boolean delete(Long id);

    List<Pet> getAll(String flag);

    List<Pet> findByName(String name);

}
