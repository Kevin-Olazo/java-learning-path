package com.ciberedu.Week03_Polymorphism.Day04_PolymorphicArrays;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog chews bone");
    }
}
