package com.ciberedu.Week04_AbstractClasses.Day03_AbstractHierarchies;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    final public void displayInfo() {
        System.out.println("Color: " + color);
    }
}
