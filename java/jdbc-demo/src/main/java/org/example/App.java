package org.example;

import org.example.data.PetDao;
import org.example.data.PetDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PetDao petDao = new PetDaoImpl();
    }
}
