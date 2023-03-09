package com.revature.springbootdemo.service;

import com.revature.springbootdemo.entity.Pet;
import com.revature.springbootdemo.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// Because we have 2 different implementations of the PetService interface
// we need to declare this as primary so Spring knows which implementation
// to autowire
@Primary
public class PetServiceImpl implements PetService{

    @Autowired
    PetRepository petRepository;


    @Override
    public Pet insert(Pet pet) {
        // From the petRepository, we get the save method
        return petRepository.save(pet);
    }

    @Override
    public Pet getById(Long id) {
        return null;
    }

    @Override
    public List<Pet> getAll() {
        return null;
    }

    @Override
    public Pet update(Pet pet) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
