package org.example;

import org.example.data.PetDao;
import org.example.data.PetDaoImpl;
import org.example.entity.Pet;

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("enter species");
        String species = scanner.nextLine();
        System.out.println("enter food");
        String food = scanner.nextLine();
        Pet pet = new Pet(name, species, food);
        Pet returnedPet =  petDao.insert(pet);

        System.out.println("Your new pet is: " + returnedPet.toString());

        // SQL injection attacks, inserting malicious statements into our SQL commands:
//        petDao.insert(new Pet("Ashes from Java", "Cat from Java", "tuna from Java'); delete * from pet;"));
    }
}
