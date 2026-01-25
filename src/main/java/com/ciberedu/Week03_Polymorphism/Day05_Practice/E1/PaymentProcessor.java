package com.ciberedu.Week03_Polymorphism.Day05_Practice.E1;

public class PaymentProcessor {
    public static void main(String[] args) {

        Payment[] payments = new Payment[3];

        Payment cashPayment = new CashPayment();
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();

        payments[0] = cashPayment;
        payments[1] = creditCardPayment;
        payments[2] = payPalPayment;

        for (Payment p : payments) {
            if (p == null) {
                break;
            }

            p.process();
            if (p instanceof CashPayment cp) {
                cp.countCoins();
            } else if (p instanceof CreditCardPayment ccp) {
                ccp.validateCard();
            } else if (p instanceof PayPalPayment ppp) {
                ppp.checkEmail();
            }
        }
    }
}
