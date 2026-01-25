package com.ciberedu.Week03_Polymorphism.Day05_Practice.E1;

public class CreditCardPayment extends Payment {

    @Override
    public void process() {
        System.out.println("Processing Credit Card Payment...");
    }

    public void validateCard() {
        System.out.println("Validating Card...");
    }
}
