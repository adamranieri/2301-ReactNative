package org.example.data;

import org.example.entity.Pet;

// declare our methods (CRUD) that we use to interact with our database
public interface PetDao {
    // insert method takes in a Pet object and returns a Pet object
    // we'll get the finalized Pet object from the operation
    public Pet insert(Pet pet);
}
