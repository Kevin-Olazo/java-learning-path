package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary / 26;
    }

    @Override
    public String getJobDescription() {
        return "Salaried Employee";
    }
}
