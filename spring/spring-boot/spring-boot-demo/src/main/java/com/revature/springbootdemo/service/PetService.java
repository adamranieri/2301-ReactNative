package com.revature.springbootdemo.service;

import com.revature.springbootdemo.entity.Pet;

import java.util.List;

public interface PetService {
    Pet insert(Pet pet);
    Pet getById(Long id);
    List<Pet> getAll();
    Pet update(Pet pet);
    boolean delete(Long id);

}
