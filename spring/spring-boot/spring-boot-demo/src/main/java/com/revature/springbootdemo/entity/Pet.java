package com.revature.springbootdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pet {
    // using a long for the id so we don't have to worry about integer limit
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
