package com.revature.springbootdemo.service;

import com.revature.springbootdemo.entity.Pet;
import com.revature.springbootdemo.repository.PetRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

// Make sure we have this @SpringBootTest annotation at the top of our test classes
@SpringBootTest
public class PetServiceTest {

    // mock the pet repository bean, pass in the interface/class that we're mocking:
    @MockBean(PetRepository.class)
    private PetRepository petRepository;

    // Autowire the PetService, so we have an instance of the petService to test out
    @Autowired PetService petService;

    @Test
    public void testInsert() {
        // initialize a pet to insert:
        Pet pet = new Pet("Ashes", "Cat", "Tuna");
        // creating the expected pet object once it is inserted and an id is generated:
        // The value 2 here is completely arbitrary, it's just so we have an actual id that is "generated" from the mocked save method
        Pet insertedPet = new Pet(2l, "Ashes", "Cat", "Tuna");

        // mock the save method of the repository, so the repository doesn't actually access the database
        // whenever the .save method is called, it will return the pet object that we created in this test case
        Mockito.when(petRepository.save(pet)).thenReturn(insertedPet);

        // ensure that the service returns the updated pet:
        Assertions.assertEquals(insertedPet, petService.insert(pet));

    }

    @Test
    public void testGetById() {
        Pet expectedPet = new Pet(1l, "Ashes", "Cat", "Tuna");
        // because findById returns an optional, we have to create a mock optional:
        Optional<Pet> petOptional = Optional.of(expectedPet);
        // So now when we call the findById method it will return an optional of the pet that we created
        Mockito.when(petRepository.findById(1l)).thenReturn(petOptional);

        // Finally, call the petService method and assert that the pet we get is the one that we specified using Mocking
        Assertions.assertEquals(expectedPet, petService.getById(1l));
    }
}
