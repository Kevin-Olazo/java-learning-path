package com.ciberedu.Week02_Inheritance.Practica.E2;

public class Empleado {
    private String id, name;
    private double baseSalary;

    public Empleado(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

}
