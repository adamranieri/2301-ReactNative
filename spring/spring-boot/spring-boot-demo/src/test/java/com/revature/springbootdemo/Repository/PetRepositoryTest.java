package com.revature.springbootdemo.Repository;

import com.revature.springbootdemo.entity.Pet;
import com.revature.springbootdemo.repository.PetRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
// make sure using h2 database:
@TestPropertySource("classpath:test.properties")
public class PetRepositoryTest {

    @Autowired
    PetRepository petRepository;


    @Test
    public void testFindCats() {
        // directly inserting using the save method:
        petRepository.save(new Pet("Ashes", "cat", "tuna"));
        petRepository.save(new Pet("Scooby", "dog", "Scooby Snacks"));
        petRepository.save(new Pet("Garfield", "cat", "lasagna"));

        // asserting that findCats returns 2 entries
        Assertions.assertEquals(2, petRepository.findCats().size());

    }
}
