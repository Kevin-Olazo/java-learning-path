package com.ciberedu.Week02_Inheritance.Practica.E1;

public class Estudiante extends Persona {
    private String studentCode;

    public Estudiante(String name, String dni, int age, String studentCode) {
        super(name, dni, age);
        this.studentCode = studentCode;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Student code: " + studentCode);

    }
}
