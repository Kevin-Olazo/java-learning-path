package com.ciberedu.Week02_Inheritance.Practica.E15;

public class Bike extends LandTransport{
    private BikeType type;

    public Bike(int capacity, int maxSpeed, int wheels, BikeType type) {
        super(capacity, maxSpeed, wheels);
        this.type = type;
    }

    @Override
    public String summary() {
        return super.summary() + " | Type: " + type;
    }
}
