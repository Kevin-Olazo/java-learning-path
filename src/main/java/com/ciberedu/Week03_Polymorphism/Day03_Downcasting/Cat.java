package com.ciberedu.Week03_Polymorphism.Day03_Downcasting;

public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, boolean isIndoor) {
        super(name);
        this.isIndoor = isIndoor;
    }

    public void purr() {
        System.out.println(getName() + " purrs..");
    }
}
