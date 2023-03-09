package com.revature.springbootdemo.repository;

import com.revature.springbootdemo.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// extend the Jpa Repository and also declaring which entity this repository is responsible for managing
public interface PetRepository extends JpaRepository<Pet, Long> {
    // We don't see a lot of methods in here because they are inherited from the parents
}
