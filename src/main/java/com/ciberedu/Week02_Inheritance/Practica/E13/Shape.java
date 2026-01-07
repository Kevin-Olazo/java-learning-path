package com.ciberedu.Week02_Inheritance.Practica.E13;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();
}
