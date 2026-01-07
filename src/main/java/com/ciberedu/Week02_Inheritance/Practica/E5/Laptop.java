package com.ciberedu.Week02_Inheritance.Practica.E5;

public class Laptop extends Dispositivo {
    private int ramGB, storageGB;

    public Laptop(String brand, String serialNumber, int ramGB, int storageGB) {
        super(brand, serialNumber);
        this.ramGB = ramGB;
        this.storageGB = storageGB;
    }

    @Override
    public void specs() {
        super.specs();
        System.out.println("Ram: " + ramGB + "GB Storage: " + storageGB + "GB");
    }
}
