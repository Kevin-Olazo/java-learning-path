package com.ciberedu.Week02_Inheritance.Practica.E5;

public class Dispositivo {
    private String brand, serialNumber;

    public Dispositivo(String brand, String serialNumber) {
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public void specs() {
        System.out.println("Brand: " + brand + " Serial Number: " + serialNumber);
    }
}
