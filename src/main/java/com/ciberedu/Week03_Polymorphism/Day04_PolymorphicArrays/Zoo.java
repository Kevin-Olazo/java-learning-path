package com.ciberedu.Week03_Polymorphism.Day04_PolymorphicArrays;

public class Zoo {
    Animal[] animals = new Animal[5];
    int count = 0;

    public Zoo() {
    }

    public void addAnimal(Animal a) {
        if (a == null) {
            throw new IllegalArgumentException("Animal cannot be null");
        }
        if (count < this.animals.length) {
            this.animals[count] = a;
            count++;
        }
    }

    void feedAll() {
        for (Animal a : this.animals) {
            if (a == null) {
                break;
            }
            a.eat();
        }
    }

    public void giveCheckup(Animal a) {
        System.out.println("Checking health stats...");

        if (a instanceof Bird) {
            System.out.println("Checking wingspan...");
        }
    }

}
