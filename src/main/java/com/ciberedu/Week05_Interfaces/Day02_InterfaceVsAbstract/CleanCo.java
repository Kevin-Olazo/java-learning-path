package com.ciberedu.Week05_Interfaces.Day02_InterfaceVsAbstract;

public class CleanCo implements Payable, Taxable {
    private int pay = 500;
    private double tax = 0.10;

    @Override
    public double calculatePay() {
        return pay;
    }

    @Override
    public double calculateTax() {
        return pay * tax;
    }
}
