package com.ciberedu.Week03_Polymorphism.Day04_PolymorphicArrays;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
}
