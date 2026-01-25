package com.ciberedu.Week03_Polymorphism.Day05_Practice.E2;

public class Triangle extends Shape {
    public double base, height;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2; // Or 0.5 * base * height;
    }
}
