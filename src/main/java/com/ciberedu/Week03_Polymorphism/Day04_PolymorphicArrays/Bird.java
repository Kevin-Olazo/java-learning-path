package com.ciberedu.Week03_Polymorphism.Day04_PolymorphicArrays;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Bird eats breadcrumbs");
    }
}
