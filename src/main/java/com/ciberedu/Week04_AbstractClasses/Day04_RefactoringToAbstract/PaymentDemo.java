package com.ciberedu.Week04_AbstractClasses.Day04_RefactoringToAbstract;

import java.util.ArrayList;

public class PaymentDemo {
    public static void main(String[] args) {

        Payment myPayment = new CreditCardPayment("TXN-349", 50.00);

        myPayment.saveToDatabase();

        CreditCardPayment newPayment = (CreditCardPayment) myPayment;

        newPayment.processCard();

    }
}
