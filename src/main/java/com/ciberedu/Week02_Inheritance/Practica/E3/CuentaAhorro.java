package com.ciberedu.Week02_Inheritance.Practica.E3;

public class CuentaAhorro extends CuentaBancaria {
    private double interestRate;

    public CuentaAhorro(String owner, double balance, double interestRate) {
        super(owner, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        setBalance(getBalance() + (getBalance() * interestRate));
    }
}
