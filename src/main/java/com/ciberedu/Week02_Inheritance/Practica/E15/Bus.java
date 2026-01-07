package com.ciberedu.Week02_Inheritance.Practica.E15;

public class Bus extends LandTransport{
    private String companyName;

    public Bus(int capacity, int maxSpeed, int wheels, String companyName) {
        super(capacity, maxSpeed, wheels);
        this.companyName = companyName;
    }

    @Override
    public String summary() {
        return super.summary() + " | Company name: " + companyName;
    }
}
