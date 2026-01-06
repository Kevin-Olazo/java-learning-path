package com.ciberedu.Week02_Inheritance.Day01_extend_keyword;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    void doWheelie() {
        System.out.println(getModel() + " is doing a wheelie! Yeehaw!");
    }

}
