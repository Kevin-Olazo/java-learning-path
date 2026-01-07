package com.ciberedu.Week02_Inheritance.Practica.E15;

public class Transport {
    private int capacity, maxSpeed;

    public Transport(int capacity, int maxSpeed) {
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String summary() {
        return "Capacity: " + capacity + " | Max speed: " + maxSpeed;
    }
}
