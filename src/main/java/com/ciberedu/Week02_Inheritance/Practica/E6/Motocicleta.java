package com.ciberedu.Week02_Inheritance.Practica.E6;

public class Motocicleta extends Vehiculo {
    private boolean hasSideCar;

    public Motocicleta(String brand, String model, int year, boolean hasSideCar) {
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void info() {
        super.info();
        if (hasSideCar){
            System.out.println("Has a side car");
        } else {
            System.out.println("Doesn't have a side car");
        }
    }
}
