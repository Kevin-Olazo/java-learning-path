package com.ciberedu.Week02_Inheritance.Day01_extend_keyword;

public class Vehicle {
    private String brand;
    private String model;
    private int year;


    void start() {

    }

    void stop() {
    }

    void displayInfo() {

    }

    @Override
    public String toString() {
        return "Brand: " + brand + " Model: " + model + " Year: " + year;
    }
}
