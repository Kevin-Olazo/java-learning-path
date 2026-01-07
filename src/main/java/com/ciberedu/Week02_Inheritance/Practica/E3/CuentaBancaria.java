package com.ciberedu.Week02_Inheritance.Practica.E3;

public class CuentaBancaria {
    private String owner;
    private double balance;

    public CuentaBancaria(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
