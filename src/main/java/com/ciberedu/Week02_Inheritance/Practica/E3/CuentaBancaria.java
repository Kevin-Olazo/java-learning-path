package com.ciberedu.Week02_Inheritance.Practica.E3;

public class CuentaBancaria {
    private String owner;
    private double balance;

    public CuentaBancaria(String owner, double balance) {
        setOwner(owner);
        setBalance(balance);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner == null || owner.isEmpty() || owner.trim().length() < 2) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    // setBalance must be private or protected
    private void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance can not be negative");
        }
        this.balance = balance;
    }

    //
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Enter a valid amount to withdraw");
        } else if (amount > balance){
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance = balance - amount;

    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Enter a valid amount to deposit");
        }
        balance = balance + amount;
    }
}
