package Tuesday.OOP.Inheritance;

public class Animal {
    private String species;
    private String name;
    private int legs;
    private boolean warmBlooded;
    private String sound;

    public Animal() {

    }

    // parameterized constructor that takes in all fields and assigns them:
    public Animal(String species, String name, int legs, boolean warmBlooded, String sound) {
        this.species = species;
        this.name = name;
        this.legs = legs;
        this.warmBlooded = warmBlooded;
        this.sound = sound;
    }

    public void speak() {
        System.out.println(this.sound);
    }

    public void whichClass() {
        System.out.println("This is the animal class");
    }


    // Getters and Setters:
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isWarmBlooded() {
        return warmBlooded;
    }

    public void setWarmBlooded(boolean warmBlooded) {
        this.warmBlooded = warmBlooded;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
