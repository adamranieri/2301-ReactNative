package com.revature.springbootdemo.entity;

// Lombok is not inherently related to Spring
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// Lombok has nothing to do with Spring:
@AllArgsConstructor
@NoArgsConstructor
@Data
// indicates that we should create a table based on this Pet class
@Entity
@Table(name = "pet_table")
public class Pet {
    // using a long for the id so we don't have to worry about integer limit
    // denotes that this field is the primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Can specify explicitly names and other properties of columns
    @Column(name = "pet_name", unique = true)
    private String name;
    @Column(name = "pet_species")
    private String species;
    private String food;

    public Pet(String name, String species, String food) {
        this.name = name;
        this.species = species;
        this.food = food;
    }
}
