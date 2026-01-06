package com.ciberedu.Week01_Encapsulation.Day04_GettersSetters;

import java.time.LocalDate;

public class TestGetterSetter {



    public static void main(String[] args) {
        Car car = new Car("Charger", "Yellow", 10000);

        System.out.println(car.getModel());

        car.setModel("Corvette");

        System.out.println(car.getModel());

        Person p1 = new Person("Kevin", "45612387", LocalDate.of(1995,10,7));
        Person p2 = new Person("Daniel", "45236587", LocalDate.of(2004, 12, 29));

        System.out.println(p1.getAge());
        System.out.println(p2.getAge());

        ImmutablePoint ip = new ImmutablePoint(2.5, 6.7);

        // ip.x = 3.5; // Can access it since it's public, but can't modify it since it's final.

        System.out.println(ip.getX());
        System.out.println(ip.getY());
    }




}
