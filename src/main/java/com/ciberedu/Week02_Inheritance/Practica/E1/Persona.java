package com.ciberedu.Week02_Inheritance.Practica.E1;

public class Persona {
    private String name, dni;
    private int age;

    public Persona(String name, String dni, int age) {
        this.name = name;
        this.dni = dni;
        this.age = age;
    }

    public void describe() {
        System.out.println("Name: " + name + " DNI: " + dni + " Edad: " + age);
    }
}
