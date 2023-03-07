package org.example.service;

import org.example.data.PetDao;
import org.example.entity.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;


// The tricky thing about testing our service layer is that it deals with the database
// With databases, we have no idea what the state of the db is at a given time
// We don't know how many pets there are, what the generated id is, etc.
// The solution and the way we can test the server is layer is mocking
// We're going to give some values to be mocked from the data layer so that we can use them in our service layer
public class PetServiceTest {
    // the dao is the class that we're mocking
    // we're going to "fake" values from the methods in this class:
    @Mock
    PetDao petDao;

    // Inject the mocked Dao into the Pet Service class
    @InjectMocks
    private PetService petService = new PetService(petDao);

    // this will run before every test:
    @Before
    public void initMocks() {
        // TODO: Look into updated method:
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInsert() {
        // first set up our input and our expected output
        Pet pet = new Pet("Geodude", "Rock", "Pokefood");
        String expectedResult = "Your new pet id is: 1";

        // setting up our mocked Dao to return a particular value when a given method is called
        when(petDao.insert(pet)).thenReturn(new Pet(1, "Geodude", "Rock", "Pokefood"));

        // then we call the service method (keeping in mind that we won't be calling the DAO methods, just using the mocks):
        String actualResult = petService.insert(pet);

        // asserting that the expected and actual are equal:
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCount() {
        int expectedResult = 3;
        // mocking the data that we want to return from the DAO method:
        List<Pet> petList = new ArrayList<>();
        petList.add(new Pet(1, "Pickahu", "mouse", "apples"));
        petList.add(new Pet(2, "Mudkip", "Pokemon", "Pokefood"));
        petList.add(new Pet(3, "Buckbeak", "Hyppogrif", "fish"));

        // have the dao method return the mocked list:
        when(petDao.getAll()).thenReturn(petList);

        // call the getNumberOfPets method to return the number
        int actualResult = petService.getNumberOfPets();

        // ensure the expected is equal to the actual:
        Assert.assertEquals(expectedResult, actualResult);

    }

}
