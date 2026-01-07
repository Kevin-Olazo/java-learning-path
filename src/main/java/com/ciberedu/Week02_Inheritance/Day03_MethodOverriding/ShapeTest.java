package com.ciberedu.Week02_Inheritance.Day03_MethodOverriding;

public class ShapeTest {
    public static void main(String[] args) {

        Shape circle = new Circle("Red", 5);

        Shape rectangle = new Rectangle("Blue", 4, 6);

        circle.displayInfo();
        rectangle.displayInfo();

        System.out.println(circle.calculateArea());

        System.out.println(rectangle.calculateArea());
    }
}
