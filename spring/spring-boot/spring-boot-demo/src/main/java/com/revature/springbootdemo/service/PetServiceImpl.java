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
        // findById returns an Optional of the value so we need to .get() the value from that:
        return petRepository.findById(id).get();
    }

    @Override
    public List<Pet> getAll() {
        return petRepository.findAll();
    }

    @Override
    public Pet update(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public boolean delete(Long id) {
        boolean found = petRepository.existsById(id);
        // only try to delete the pet if id is found:
        if(found) petRepository.deleteById(id);
        return found;
    }

    @Override
    public List<Pet> getAll(String flag) {
        System.out.println(flag);
        // this overloaded method takes in a flag and calls the corresponding Repository method:
        switch(flag) {
            case "cats":
                return petRepository.findCats();
            default:
                return petRepository.findAll();
        }
    }

    @Override
    public List<Pet> findByName(String name) {
        return petRepository.findByName(name);
    }
}
