package com.revature.springbootdemo.service;

import com.revature.springbootdemo.entity.Pet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Component
// A more specific/specialized version of the @Component Stereotype
@Service
public class PetServiceDummyImpl implements PetService{

    @Override
    public Pet insert(Pet pet) {
        // manually update id and return it
        pet.setId(2l);
        return pet;
    }

    @Override
    public Pet getById(Long id) {
        // return a fake pet with that same id:
        return new Pet(id, "Garfield", "cat", "lasaga");
    }

    @Override
    public List<Pet> getAll() {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet(1l, "Scooby", "Dog", "Scooby Snacks"));
        pets.add(new Pet(2l, "Scrappy", "Dog", "Scrappy Snacks"));
        pets.add(new Pet(3l, "Garfield", "Cat", "Lasagna"));
        return pets;
    }

    @Override
    public Pet update(Pet pet) {
        return pet;
    }

    @Override
    public boolean delete(Long id) {
        if(id == 1) return true;
        else return false;
    }

    @Override
    public List<Pet> getAll(String flag) {
        return null;
    }

    @Override
    public List<Pet> findByName(String name) {
        return null;
    }
}
