package com.ciberedu.Week05_Interfaces.Day02_InterfaceVsAbstract;

public class FullTime extends Employee implements Payable, Taxable{

    private double monthlySalary;

    public FullTime(String name, double monthlySalary) {
        super(name);
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("Error: Salary cannot be negative.");
        }
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double calculatePay() {
        return this.monthlySalary;
    }

    @Override
    public double calculateTax() {
        return monthlySalary * 0.20;
    }
}
