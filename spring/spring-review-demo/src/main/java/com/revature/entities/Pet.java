package com.revature.entities;

// JPA Java Persistence API
import javax.persistence.*;

@Entity
// In this case, we want to make sure this table name matches what we have in our schema.sql/data.sql
// Even if we don't create our tables manually, we can still use this annotation to explicitly state what our table will be called
@Table(name = "pet")
public class Pet {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // We can use the @Column annotation to explicitly state which column of the table matches up to this field:
    // if we don't have this, ORM will just use the name of the field to create that:
    @Column(name = "name")
    private String name;
    @Column(name = "species")
    private String species;


    // Replace our @NoArgsConstructor:
    public Pet() {
    }

    // Replace our @AllArgsConstructor:
    public Pet(Long id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
