package com.ciberedu.Week02_Inheritance.Practica.E13;

public class Rectangle extends Shape {
    private int length, width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
