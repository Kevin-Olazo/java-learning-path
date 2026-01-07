package com.ciberedu.Week02_Inheritance.Day01_extend_keyword;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand,model,year);
        this.numberOfDoors = numberOfDoors;
    }

    void openTrunk() {
        System.out.println("Trunk of " + getModel() + " has opened!");
    }

}
