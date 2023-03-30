package com.revature.services;

import com.revature.entities.Pet;
import com.revature.exceptions.PetNotFoundException;
import com.revature.repositories.PetRepository;
import com.revature.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// stereotype annotation, mark this class a component/bean
@Service
public class PetServiceImpl implements PetService {

    // inject the petRepository bean into this service
    // this will allow us to have a repository bean that we interact with/call methods on in these methods
    // Property based Injection
    @Autowired
    PetRepository petRepository;

    // Constructor based injection because the @Autowired is going right over the constructor where
    // Constructor based is good for testing
//    @Autowired
//    public PetServiceImpl(PetRepository petRepository){
//        this.petRepository = petRepository;
//
//    }

    public Pet upsert(Pet pet) {
        return petRepository.save(pet);
    }

    // This transaction will not alter any data in the table:
    @Transactional(readOnly = true)
    public Pet getById(Long id) throws PetNotFoundException{
        if(!petRepository.existsById(id)) throw new PetNotFoundException();
        else return petRepository.findById(id).get();
    }
}
