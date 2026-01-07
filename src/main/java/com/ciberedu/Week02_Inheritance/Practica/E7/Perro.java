package com.ciberedu.Week02_Inheritance.Practica.E7;

public class Perro extends Animal{
    private String breed;

    public Perro(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void describe() {
        System.out.println(getName() + " is a " + breed + " and is " + getAge() + " years old.");
    }
}
