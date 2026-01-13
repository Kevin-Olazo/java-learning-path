package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E1_VehicleRentalSystem;

public class Car extends RentalVehicle {
    private boolean hasGPS;

    public Car(String licensePlate, double dailyRate, long odometerReading, boolean hasGPS) {
        super(licensePlate, dailyRate, odometerReading);
        this.hasGPS = hasGPS;
    }


    @Override
    public double calculateTotalCost(int days) {
        if (hasGPS) {
            return getDailyRate() * days + 50.00;
        }
        return getDailyRate() * days;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Checking engine oil and refilling wiper fluid");
    }
}
