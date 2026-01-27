package com.ciberedu.Week05_Interfaces.Day02_InterfaceVsAbstract;

public class Contractor extends Employee implements Payable{
    private double hourlyRate;
    private int hoursWorked;

    public Contractor(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

}
