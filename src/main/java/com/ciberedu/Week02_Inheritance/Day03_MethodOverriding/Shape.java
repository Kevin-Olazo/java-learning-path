package com.ciberedu.Week02_Inheritance.Day03_MethodOverriding;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.trim().length() < 2) {
            throw new IllegalArgumentException("Enter a valid color.");
        }
        this.color = color;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("I am a [" + color + "] shape.");
    }
}
