package com.ciberedu.Week03_Polymorphism.Day02_Upcasting;

public class Dog extends Animal{

    void guardHouse() {
        System.out.println("Dog is guarding the house");
    }

    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}
