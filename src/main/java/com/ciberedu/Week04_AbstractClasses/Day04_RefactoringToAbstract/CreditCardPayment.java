package com.ciberedu.Week04_AbstractClasses.Day04_RefactoringToAbstract;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    public void processCard() {
        System.out.println("Processing Card...");
    }

}
