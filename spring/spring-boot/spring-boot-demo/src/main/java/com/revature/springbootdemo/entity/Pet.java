package com.revature.springbootdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
// indicates that we should create a table based on this Pet class
@Entity
public class Pet {
    // using a long for the id so we don't have to worry about integer limit
    // denotes that this field is the primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String species;
    private String food;

    public Pet(String name, String species, String food) {
        this.name = name;
        this.species = species;
        this.food = food;
    }
}
