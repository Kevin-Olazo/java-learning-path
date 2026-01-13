package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E2_StreamSubService;

public abstract class Subscription {
    private String subscriberName;
    private double basePrice;
    private String planType;

    public Subscription(String subscriberName, double basePrice, String planType) {
        this.subscriberName = subscriberName;
        this.basePrice = basePrice;
        this.planType = planType;
    }


    // CONCRETE METHOD
    public void printInvoice() {
        System.out.println("User: " + subscriberName + " | Plan: " + planType + " | Total: $" + calculateMonthlyFee());
    }

    // ABSTRACT METHODS
    public abstract double calculateMonthlyFee();
    public abstract void accessContent(String title);


    // GETTERS AND SETTERS

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getPlanType() {
        return planType;
    }


}
