package com.ciberedu.Week02_Inheritance.Practica.E7;

public class Gato extends Animal {
    private boolean isIndoor;

    public Gato(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    public void describe() {
        if (isIndoor) {
            System.out.println(getName() + " is an indoor cat, they age is: " + getAge());
        } else {
            System.out.println(getName() + " is an outdoor cat, they age is: " + getAge());
        }
    }
}
