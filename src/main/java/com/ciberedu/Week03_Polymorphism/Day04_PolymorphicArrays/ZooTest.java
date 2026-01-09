package com.ciberedu.Week03_Polymorphism.Day04_PolymorphicArrays;

public class ZooTest {
    public static void main(String[] args) {
        Zoo newZoo = new Zoo();

        Cat cat1 = new Cat("Pisco");
        Dog dog1 = new Dog("Chato");
        Cat cat2 = new Cat("Mona");
        Cat cat3 = new Cat("Whisky");
        Cat cat4 = new Cat("Tigresa");
        Bird bird1 = new Bird("Norberto");

        newZoo.addAnimal(cat1);
        newZoo.addAnimal(dog1);
        newZoo.addAnimal(cat2);
        newZoo.addAnimal(cat3);
        newZoo.addAnimal(bird1);

        newZoo.feedAll();

        newZoo.giveCheckup(dog1);
        newZoo.giveCheckup(bird1);
    }
}
