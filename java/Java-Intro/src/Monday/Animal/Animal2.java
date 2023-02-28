package Monday.Animal;

import java.util.Objects;

public class Animal2 {
    String name;
    String species;
    int age;
    int legs;

    // Right-click the class, click generate, select toString and then select the fields you want and click ok
    @Override
    public String toString() {
        return "Animal2{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                '}';
    }

    // Right-click the class, click generate, select equals and hashCode and then select the fields you want for both methods and click ok
    @Override
    public boolean equals(Object o) {
        // first check the memory reference:
        if (this == o) return true;
        // then make sure o is not null and classes match
        if (o == null || getClass() != o.getClass()) return false;
        // cast the object to animal:
        Animal2 animal2 = (Animal2) o;
        // check all the properties:
        return age == animal2.age && legs == animal2.legs && Objects.equals(name, animal2.name) && Objects.equals(species, animal2.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, species, age, legs);
    }
}
