package com.ciberedu.Week02_Inheritance.Day01_extend_keyword;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private boolean isStarted;

    public Vehicle(String brand, String model, int year) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        this.isStarted = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().length() < 2) {
            throw new IllegalArgumentException("Enter a valid brand");
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.trim().length() < 2) {
            throw new IllegalArgumentException("Enter a valid model");
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Enter a valid year.");
        }
        this.year = year;
    }

    void start() {
        if (!this.isStarted) {
            System.out.println(model + "'s Engine starting...");
            this.isStarted = true;
        } else {
            System.out.println(model + "'s Engine already running.");
        }


    }

    void stop() {
        if (this.isStarted){
            System.out.println(model + "'s Engine stopping...");
            this.isStarted = false;
        } else {
            System.out.println(model + "'s Engine already off.");
        }

    }

    void displayInfo() {
        System.out.println(brand + " " + model + " " + year);
    }

    @Override
    public String toString() {
        return "Brand: " + brand + " Model: " + model + " Year: " + year;
    }
}
