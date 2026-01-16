package com.ciberedu.Week04_AbstractClasses.Day03_AbstractHierarchies;

import java.util.ArrayList;

public class ShapeDemo {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Triangle("blue", 70, 100));

        shapes.add(new Circle("red",50));

        for (Shape shape : shapes) {
            shape.displayInfo();
            System.out.println(shape.calculateArea());
        }

    }

}
