package com.ciberedu.Week04_AbstractClasses.Day03_AbstractHierarchies;

public abstract class Polygon extends Shape {
    private int sides;

    public Polygon(String color, int sides) {
        super(color);
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
