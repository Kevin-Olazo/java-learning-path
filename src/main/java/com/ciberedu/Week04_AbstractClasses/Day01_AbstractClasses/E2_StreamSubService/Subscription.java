package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E2_StreamSubService;

public abstract class Subscription {
    private String subscriberName;
    private double basePrice;
    private String planType;

    // CONCRETE METHOD
    public void printInvoice() {
        System.out.println("User: " + subscriberName + " | Plan: " + planType + " | Total: $" + calculateMonthlyFee());
    }

    // ABSTRACT METHODS
    public abstract double calculateMonthlyFee();
    public abstract void accessContent(String title);



}
