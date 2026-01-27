package com.ciberedu.Week05_Interfaces.Day04_CommonInterfaces.E1;

public class CargoItem implements Comparable<CargoItem> {
    private String name;
    private double weight;
    private int value;

    public CargoItem(String name, double weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(CargoItem other) {
        return Double.compare(this.weight, other.getWeight());
    }
}
