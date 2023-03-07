package org.example.data;

import org.example.entity.Pet;

import java.util.List;

// declare our methods (CRUD) that we use to interact with our database
public interface PetDao {
    // insert method takes in a Pet object and returns a Pet object
    // we'll get the finalized Pet object from the operation
    Pet insert(Pet pet);

    // return a pet by its id:
    Pet getById(int id);

    // getAll doesn't take in any parameters, returns a list of Pets
    List<Pet> getAll();


    // update Pet
    Pet update(Pet pet);

    // delete Pet
    // return true, false otherwise
    boolean delete(int id);

}
