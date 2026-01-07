package com.ciberedu.Week02_Inheritance.Day03_MethodOverriding;

public class Rectangle extends Shape {
    private int length, width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I am a Rectangle with area [" + calculateArea() + "]");
    }
}
