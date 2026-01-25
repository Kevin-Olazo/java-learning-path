package com.ciberedu.Week03_Polymorphism.Day03_Downcasting;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(getName() + " barks...");
    }
}
