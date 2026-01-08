package com.ciberedu.Week03_Polymorphism.Day01_CompileVsRuntime;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();

        printer.printData("123");

        printer.printData(8);

        printer.printData(75.25);

        PaymentProcessor pay1 = new PayPalProcessor();

        pay1.processPayment();

        pay1 = new CreditCardProcessor();

        pay1.processPayment();

    }
}
