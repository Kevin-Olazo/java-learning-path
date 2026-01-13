package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E4_SecureBankingSystem;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;
    private String holderName;

    public BankAccount(String accountNumber, double balance, String holderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Enter a valid amount to deposit");
        }

        this.balance += amount;
        System.out.println("Deposited: $" + amount);

    }

    public void transfer(BankAccount target, double amount) {
        if (withdraw(amount)) {
            target.deposit(amount);
        } else {
            System.out.println("Transfer failed");
        }
    }

    public abstract boolean withdraw(double amount);

    public abstract void applyEndOfMonth();


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
