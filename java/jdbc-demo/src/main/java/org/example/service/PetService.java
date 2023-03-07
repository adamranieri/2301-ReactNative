package org.example.service;

import org.example.data.PetDao;
import org.example.entity.Pet;

import java.util.List;

// We use the service class to handle any logic that isn't part of the data layer or the
// RESTful controller layer
// Business Logic
public class PetService {
    PetDao petDao;

    // Because the petDao could have different implementations, we can specify which implementation we want
    public PetService(PetDao petDao) {
        this.petDao = petDao;
    }

//    public Pet insert(Pet pet) {
//        // sometimes we'll see the service are simple, just calling the DAO method and returning the result directly:
//        return this.petDao.insert(pet);
//    }

    // this insert method returns a string containing the generated id:
    public String insert(Pet pet) {
        Pet petDb = this.petDao.insert(pet);
        return "Your new pet id is: " + petDb.getId();
    }

    public List<Pet> getAll() {
        return this.petDao.getAll();
    }

    public int getNumberOfPets() {
        List<Pet> pets = this.petDao.getAll();
        return pets.size();
    }

    // this method takes in an id and a name and returns that updated pet
    // null if the id doesn't exist:
    public Pet updateName(int id, String name) {
        // first, let's get the pet from the database:
        Pet petDb = this.petDao.getById(id);
        if(petDb == null) return null;
        petDb.setName(name);
        return this.petDao.update(petDb);
    }

    public String deletePet(int id) {
        return this.petDao.delete(id) ? "Pet was deleted!" : "Pet was not deleted";
    }



//    public Pet login() {
//        // let's say we get the username and password from db
//        // we could do the check here to make sure that we're returning the correct message
//        // username not found, password not found
//        // send that message back to the controller layer
//        return null;
//    }

}
