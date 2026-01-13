package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E1_VehicleRentalSystem;

public abstract class RentalVehicle {
    private String licensePlate;
    private double dailyRate;
    private boolean isRented = false;
    private long odometerReading;

    public RentalVehicle(String licensePlate, double dailyRate, long odometerReading) {
        this.licensePlate = licensePlate;
        this.dailyRate = dailyRate;
        this.odometerReading = odometerReading;
    }

    // CONCRETE METHODS
    public void rentVehicle() {
        if (isRented){
            System.out.println("Error. Vehicle already rented");
        } else {
            this.isRented = true;
        }


    }

    public void returnVehicle(long milesDriven) {
        if (!isRented){
            long newOdometer = this.odometerReading + milesDriven;
            setRented(false);
            setOdometerReading(newOdometer);
            System.out.println("Vehicle returned. New Odometer: " + newOdometer);
        } else {
            System.out.println("Error.");
        }
    }


    // ABSTRACT METHODS

    public abstract double calculateTotalCost();
    public abstract void performMaintenance();

    // GETTERS AND SETTERS
    public long getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(long odometerReading) {
        this.odometerReading = odometerReading;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
