package animals;

public class Bird extends Animal {
    private String name;
    private int year;

    public Bird(String name, int year) {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    @Override
    public String getMovement() {
        return "fly";
    }

    @Override
    public String getReproduction() {
        return "eggs";
    }

    @Override
    public String getBreath() {
        return "lungs";
    }

    @Override
    public String toString() {
        return "\nAnimal{id= " + id + ", name= " + name + ", yearNamed= " + year + " }";
    }

    @Override
    public int getYearNamed() {
        return year;
    }

    @Override
    public String getName() {
        return name;
    }

}