package com.ciberedu.Week03_Polymorphism.Day01_CompileVsRuntime;

public class CreditCardProcessor extends PaymentProcessor {

    @Override
    void processPayment() {
        System.out.println("Validating Card Number...");
    }
}
