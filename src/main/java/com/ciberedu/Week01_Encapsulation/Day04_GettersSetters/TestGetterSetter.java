package com.ciberedu.Week01_Encapsulation.Day04_GettersSetters;

public class TestGetterSetter {

    public static void main(String[] args) {
        Car car = new Car("Charger", "Yellow", 10000);

        System.out.println(car.getModel());

        car.setModel("Corvette");

        System.out.println(car.getModel());


        ImmutablePoint ip = new ImmutablePoint(2.5, 6.7);

        // ip.x = 3.5; // Can access it since it's public, but can't modify it since it's final.

        System.out.println(ip.getX());
        System.out.println(ip.getY());
    }




}
