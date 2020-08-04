package animals;

public class Fish extends Animal {

    private String name;
    private int year;

    public Fish(String name, int year) {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    @Override
    public String getMovement() {
        return "swim";
    }

    @Override
    public String getReproduction() {
        return "eggs";
    }

    @Override
    public String getBreath() {
        return "gills";
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