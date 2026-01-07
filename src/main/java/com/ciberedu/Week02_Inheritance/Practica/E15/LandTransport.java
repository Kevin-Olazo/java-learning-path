package com.ciberedu.Week02_Inheritance.Practica.E15;

public class LandTransport extends Transport {
    private int wheels;

    public LandTransport(int capacity, int maxSpeed, int wheels) {
        super(capacity, maxSpeed);
        this.wheels = wheels;
    }

    @Override
    public String summary() {
        return super.summary() + " | Wheels: " + wheels;
    }
}
