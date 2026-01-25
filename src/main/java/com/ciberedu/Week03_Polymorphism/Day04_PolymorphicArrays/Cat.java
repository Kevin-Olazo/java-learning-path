package com.ciberedu.Week03_Polymorphism.Day04_PolymorphicArrays;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating fish");
    }
}
