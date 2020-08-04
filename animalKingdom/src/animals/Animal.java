package animals;

abstract class Animal {
    protected int food;
    protected static int maxId;
    protected int id;

    void consumeFood(int i) {
        food = food + i;
    }
    
    abstract String getMovement();
    abstract String getReproduction();
    abstract String getBreath();
    abstract int getYearNamed();
    abstract String getName();
}