package animals;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

        // Custom method used originally...

        // public static List<Animal> filteredAnimals = new ArrayList<>();
        // public static void filterAnimals(List<Animal> animals, CheckAnimals tester) {
        // filteredAnimals.clear();
        // for (Animal animal : animals) {
        // if (tester.test(animal)) {
        // filteredAnimals.add(animal);
        // }
        // }
        // }

        public static void main(String[] args) {

                // Instantiate list of mammals
                Mammal panda = new Mammal("Panda", 1869);
                Mammal zebra = new Mammal("Zebra", 1778);
                Mammal koala = new Mammal("Koala", 1816);
                Mammal sloth = new Mammal("Sloth", 1804);
                Mammal armadillo = new Mammal("Armadillo", 1758);
                Mammal raccoon = new Mammal("Raccoon", 1758);
                Mammal bigfoot = new Mammal("Bigfoot", 2021);

                // Instantiate list of birds
                Bird pigeon = new Bird("Pigeon", 1837);
                Bird peacock = new Bird("Peacock", 1821);
                Bird toucan = new Bird("Toucan", 1758);
                Bird parrot = new Bird("Parrot", 1824);
                Bird swan = new Bird("Swan", 1758);

                // Instantiate list of fish
                Fish salmon = new Fish("Salmon", 1758);
                Fish catfish = new Fish("Catfish", 1817);
                Fish perch = new Fish("Perch", 1758);

                List<Animal> animalList = new ArrayList<>();
                animalList.add(panda);
                animalList.add(zebra);
                animalList.add(koala);
                animalList.add(sloth);
                animalList.add(armadillo);
                animalList.add(raccoon);
                animalList.add(bigfoot);
                animalList.add(pigeon);
                animalList.add(peacock);
                animalList.add(toucan);
                animalList.add(parrot);
                animalList.add(swan);
                animalList.add(salmon);
                animalList.add(catfish);
                animalList.add(perch);

                animalList.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
                System.out.println("\n*** List all the animals in descending order by year named ***");
                System.out.println(animalList);

                animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
                System.out.println("\n*** List all the animals alphabetically ***");
                System.out.println(animalList);

                animalList.sort((a1, a2) -> a1.getMovement().compareToIgnoreCase(a2.getMovement()));
                System.out.println("\n*** List all the animals order by how they move ***");
                System.out.println(animalList);

                // Using Stream and filter..
                List<Animal> breathsWithLungs = animalList.stream().filter(a -> a.getBreath().equals("lungs"))
                                .collect(Collectors.toList());

                // Using interface and custom method...
                // filterAnimals(animalList, animal -> animal.getBreath().equals("lungs"));

                System.out.println("\n*** List only those animals that breath with lungs ***");

                // Prints ArrayList built with custom method and interface
                // filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " +
                // animal.getReproduction()
                // + " " + animal.getMovement() + " " + animal.getBreath() + " " +
                // animal.getYearNamed()));

                // Prints ArrayList from Stream and filter...
                breathsWithLungs.forEach(animal -> System.out.println(animal.getName() + " " + animal.getReproduction()
                                + " " + animal.getMovement() + " " + animal.getBreath() + " " + animal.getYearNamed()));

                // Using interface and custom method...
                // filterAnimals(animalList,
                // animal -> animal.getBreath().equals("lungs") && animal.getYearNamed() ==
                // 1758);

                // Using Stream and filter...
                List<Animal> lungsAndYear = animalList.stream()
                                .filter(a -> a.getBreath().equals("lungs") && a.getYearNamed() == 1758)
                                .collect(Collectors.toList());
                System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");

                // Prints ArrayList built with custom method and interface
                // filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " +
                // animal.getReproduction()
                // + " " + animal.getMovement() + " " + animal.getBreath() + " " +
                // animal.getYearNamed()));

                // Prints ArrayList from Stream and filter...
                lungsAndYear.forEach(animal -> System.out.println(animal.getName() + " " + animal.getReproduction()
                                + " " + animal.getMovement() + " " + animal.getBreath() + " " + animal.getYearNamed()));

                // Using interface and custom method...
                // filterAnimals(animalList, animal -> animal.getBreath().equals("lungs")
                // && animal.getReproduction().equals("eggs"));

                System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");

                // Prints ArrayList from custom method...
                // filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " +
                // animal.getReproduction()
                // + " " + animal.getMovement() + " " + animal.getBreath() + " " +
                // animal.getYearNamed()));
                List<Animal> lungsAndEggs = animalList.stream()
                                .filter(a -> a.getBreath().equals("lungs") && a.getReproduction().equals("eggs"))
                                .collect(Collectors.toList());

                // Prints lungsAndEggs list
                lungsAndEggs.forEach(animal -> System.out.println(animal.getName() + " " + animal.getReproduction()
                                + " " + animal.getMovement() + " " + animal.getBreath() + " " + animal.getYearNamed()));

                animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

                List<Animal> animalsIn1758 = animalList.stream().filter(a -> a.getYearNamed() == 1758)
                                .collect(Collectors.toList());

                // Using custom method to filter
                // filterAnimals(animalList, animal -> animal.getYearNamed() == 1758);
                System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");

                // Printed from custom method
                // filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " +
                // animal.getReproduction()
                // + " " + animal.getMovement() + " " + animal.getBreath() + " " +
                // animal.getYearNamed()));
                animalsIn1758.forEach(animal -> System.out.println(animal.getName() + " " + animal.getReproduction()
                                + " " + animal.getMovement() + " " + animal.getBreath() + " " + animal.getYearNamed()));

                // *** STRETCH GOAL ***
                List<Animal> alphabeticalMammals = animalList.stream().filter(a -> a instanceof Mammal)
                                .collect(Collectors.toList());
                // filterAnimals(animalList, animal -> animal instanceof Mammal);

                System.out.println(
                                "\n*** For the list of animals, list alphabetically those animals that are mammals ***");

                // Printed using custom method...
                // filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " +
                // animal.getReproduction()
                // + " " + animal.getMovement() + " " + animal.getBreath() + " " +
                // animal.getYearNamed()));

                // Using Stream and filter
                alphabeticalMammals.forEach(animal -> System.out
                                .println(animal.getName() + " " + animal.getReproduction() + " " + animal.getMovement()
                                                + " " + animal.getBreath() + " " + animal.getYearNamed()));

        }
}