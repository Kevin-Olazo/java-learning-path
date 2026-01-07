package com.ciberedu.Week02_Inheritance.Practica.E6;

public class Carro extends Vehiculo{
    private int numberOfDoors;

    public Carro(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
