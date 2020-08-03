package animals;

public class Mammal extends Animal {

    private String name;
    private int year;

    public Mammal(String name, int year) {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    @Override
    public String getMovement() {
        return "walk";
    }

    @Override
    public String getReproduction() {
        return "live births";
    }

    @Override
    public String getBreath() {
        return "lungs";
    }

    @Override
    public String toString() {
        return "Mammal name: " + name + " Id: " + id + " Year named: " + year;
    }
}