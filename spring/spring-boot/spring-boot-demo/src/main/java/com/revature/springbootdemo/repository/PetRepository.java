package com.revature.springbootdemo.repository;

import com.revature.springbootdemo.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// extend the Jpa Repository and also declaring which entity this repository is responsible for managing
public interface PetRepository extends JpaRepository<Pet, Long> {
    // We don't see a lot of methods in here because they are inherited from the parents

    // how do we make our own queries:
    // native query means we want psql syntax as opposed to HQL (Hibernate Query Language)
    // We can use @Query to manually write some SQL code:
    @Query(value = "SELECT * FROM pet_table WHERE pet_species = 'cat'", nativeQuery = true)
    public List<Pet> findCats();

    // Derived query, should deduce what we want just based on the method name:
    // https://www.baeldung.com/spring-data-derived-queries
    List<Pet> findByName(String name);


}
