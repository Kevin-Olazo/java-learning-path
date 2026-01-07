package com.ciberedu.Week02_Inheritance.Day03_MethodOverriding;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I am a Circle with radius [" + radius + "]");
    }
}
