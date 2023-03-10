package com.revature.springbootdemo.service;

import com.revature.springbootdemo.entity.Pet;
import com.revature.springbootdemo.repository.PetRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class PetServiceTest {

    // mock the pet repository bean:
    @MockBean(PetRepository.class)
    private PetRepository petRepository;

    // Autowire the PetService:
    @Autowired PetService petService;

    @Test
    public void contextLoads() {
        Pet pet = new Pet("Ashes", "Cat", "Tuna");
        Pet updatedPet = new Pet(2l, "Ashes", "Cat", "Tuna");

        // mock the save method of the repository:
        Mockito.when(petRepository.save(pet)).thenReturn(updatedPet);

        // ensure that the service returns the updated pet:
        Assertions.assertEquals(updatedPet, petService.insert(pet));

    }
}
