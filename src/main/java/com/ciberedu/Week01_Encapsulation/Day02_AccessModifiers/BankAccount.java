package com.ciberedu.Week01_Encapsulation.Day02_AccessModifiers;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;


    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        if (balance < 0) {
            throw new IllegalArgumentException("Error. Balance cannot be negative when creating a Bank account.");
        } else {
            this.balance = balance;
        }
        this.ownerName = ownerName;

    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error. Deposit amount invalid");
            throw new IllegalArgumentException("Error. Cannot deposit an invalid value");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Error. Withdraw amount must be greater than 0");
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void printStatement() {
        System.out.println("Account Number: " + this.accountNumber + " Owner: " + this.ownerName + " Balance: " + getBalance());
    }
}
