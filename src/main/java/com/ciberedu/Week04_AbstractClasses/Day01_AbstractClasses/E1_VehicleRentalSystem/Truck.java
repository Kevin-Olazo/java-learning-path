package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E1_VehicleRentalSystem;

public class Truck extends RentalVehicle{
    private double cargoCapacity; // in tons

    public Truck(String licensePlate, double dailyRate, long odometerReading, double cargoCapacity) {
        super(licensePlate, dailyRate, odometerReading);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateTotalCost(int days) {
        double totalCost =  getDailyRate() * days;

        if (cargoCapacity > 5) {
            return totalCost + (100.00 * days);
        }

        return totalCost;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Inspecting tires and hydraulic lift.");
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
