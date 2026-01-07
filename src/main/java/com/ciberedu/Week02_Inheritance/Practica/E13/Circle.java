package com.ciberedu.Week02_Inheritance.Practica.E13;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
}
