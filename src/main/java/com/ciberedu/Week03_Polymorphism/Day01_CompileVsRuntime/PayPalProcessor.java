package com.ciberedu.Week03_Polymorphism.Day01_CompileVsRuntime;

public class PayPalProcessor extends PaymentProcessor{

    @Override
    void processPayment() {
        System.out.println("Redirecting to PayPal...");
    }
}
