package com.revature.repositories;

import com.revature.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// Repository is one of our stereotypes
// marks this as a component with the added specifity that it is being used as a Repository
// Could just use @Component but @Repository gives us more clarity:
// If we don't mark this is as Component/Bean, then we won't be able to inject it or use it in the Service layer
@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}
