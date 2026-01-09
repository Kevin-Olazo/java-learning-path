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
        if (shapes == null || shapes.length == 0) {
            throw new IllegalArgumentException("Shapes array cannot be null");
        }

        Shape largestShape = null;
        double largestArea = 0;

        for (Shape shape : shapes) {
            if (shape == null) {
                continue;
            }

            if (shape.calculateArea() > largestArea) {
                largestArea = shape.calculateArea();
                largestShape = shape;
            }
        }

        return largestShape;

    }
}
