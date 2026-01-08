package com.ciberedu.Week03_Polymorphism.Day03_Downcasting;

public class VetClinic {

    public void examineAnimal(Animal a){
        if (a instanceof Dog){
            Dog dog = (Dog) a;
            dog.bark();
        }

        if (a instanceof Cat c) {
            c.purr();
        }
    }
}
