package com.ciberedu.Week03_Polymorphism.Day02_Upcasting;

public class AnimalShelter {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        Animal dog = new Dog();
        Animal bird = new Bird();
        Animal cat = new Cat();

        animals[0] = dog;
        animals[1] = bird;
        animals[2] = cat;

        for (Animal a : animals) {
            a.makeSound();
            if (a instanceof Dog d) {
                d.guardHouse();
            }
        }
    }
}
