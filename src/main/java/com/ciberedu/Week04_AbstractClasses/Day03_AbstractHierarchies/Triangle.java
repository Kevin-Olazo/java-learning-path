package com.ciberedu.Week04_AbstractClasses.Day03_AbstractHierarchies;

public class Triangle extends Polygon{
    private double base, height;
    private static final int sides = 3 ;

    public Triangle(String color, double base, double height) {
        super(color, sides);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
