package com.ciberedu.Week02_Inheritance.Practica.E6;

public class Vehiculo {
    private String brand, model;
    private int year;

    public Vehiculo(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Brand: " + brand + " Model: " + model + " Year: " + year);
    }
}
