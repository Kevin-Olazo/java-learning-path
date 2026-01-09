package com.ciberedu.Week03_Polymorphism.Day05_Practice.E2;

public class ShapeCalculator {

    public void printShapeInfo(Shape[] shapes) {
        if (shapes == null) {
            throw new IllegalArgumentException("Shapes array cannot be null");
        }

        for (Shape sh : shapes) {
            System.out.println(sh.calculateArea());
        }
    }

    public Shape findLargestShape(Shape[] shapes) {
        if (shapes == null) {
            throw new IllegalArgumentException("Shapes array cannot be null");
        }

        Shape largestShape = shapes[0];
        double largestArea = shapes[0].calculateArea();

        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i] == null) {
                break;
            }

            if (shapes[i].calculateArea() > largestArea) {
                largestArea = shapes[i].calculateArea();
                largestShape = shapes[i];
            }
        }

        return largestShape;
    }
}
