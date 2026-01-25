package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods.E3;

public class AmphibiousVehicle implements Car, Boat{

    @Override
    public void drive() {
        System.out.println("I am an amphibious vehicle!");
        Car.super.drive();
        Boat.super.drive();
    }

}
