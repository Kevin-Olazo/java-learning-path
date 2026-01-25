package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses;

import java.time.LocalDateTime;

public abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void clockIn() {
        System.out.println("Employee " + name + " clocked in. " + LocalDateTime.now());
    }

    public void printPaycheck() {
        System.out.println("Paycheck for " + name + ": $" + calculatePay());
    }

    public abstract double calculatePay();

    public abstract String getJobDescription();
}
