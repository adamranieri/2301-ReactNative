package org.example;

import org.example.data.PetDao;
import org.example.data.PetDaoImpl;
import org.example.data.PetDaoTempImpl;
import org.example.entity.Pet;
import org.example.service.PetService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PetDao petDao = new PetDaoImpl();
        petDao.insert(new Pet("Ashes from Java", "Cat from Java", "tuna from Java"));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter name");
//        String name = scanner.nextLine();
//        System.out.println("enter species");
//        String species = scanner.nextLine();
//        System.out.println("enter food");
//        String food = scanner.nextLine();
//        Pet pet = new Pet(name, species, food);
//        Pet returnedPet =  petDao.insert(pet);

//        System.out.println("Your new pet is: " + returnedPet.toString());


        System.out.println(petDao.getById(5));
        System.out.println(petDao.getAll());

        Pet updatedPet = new Pet(12, "updated name from Java", "updated species from Java", "updated food from Java");
        // should be null if id doesn't exist in db, otherwise we should get the exact same object back:
        System.out.println(petDao.update(updatedPet));

        System.out.println(petDao.delete(15));

        // SQL injection attacks, inserting malicious statements into our SQL commands:
//        petDao.insert(new Pet("Ashes from Java", "Cat from Java", "tuna from Java'); delete * from pet;"));

        // The way our service is set up, we can instantiate using whatever implementation of the DAO we want:
        PetService petService1 = new PetService(new PetDaoImpl());
        PetService petService2 = new PetService(new PetDaoTempImpl());

        String result = petService1.insert(new Pet("Ashes", "cat", "tuna"));
        System.out.println(result);

        System.out.println("Number of total pets: " + petService1.getNumberOfPets());

        System.out.println(petService1.updateName(23, "Geodude"));
        System.out.println(petService1.updateName(10000, "Name doesn't matter"));

        System.out.println(petService1.deletePet(25));
        System.out.println(petService1.deletePet(25));



    }
}
