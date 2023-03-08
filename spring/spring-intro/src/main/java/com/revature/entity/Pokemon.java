package com.revature.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok can be used for any Java project whether we use Spring or not
@Data // Getters, Setters, toString, equals, hashCode
@NoArgsConstructor // constructor with no args
@AllArgsConstructor // take in each field and then assign them
public class Pokemon {
    private String species;
    private String name;
    private String type1;
    private String type2;
    private int level;
}
