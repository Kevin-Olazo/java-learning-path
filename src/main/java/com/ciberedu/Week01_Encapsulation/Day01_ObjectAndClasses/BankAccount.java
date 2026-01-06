package com.ciberedu.Week01_Encapsulation.Day01_ObjectAndClasses;


public class BankAccount {
    // TODO: Define your 3 instance fields
    private int accountNumber;
    private double balance;
    private String ownerName;

    // TODO: Define your 2 static fields
    private static double interestRate = 0.05;
    private static int totalAccountsCreated = 0;

    public BankAccount(String ownerName, double initialBalance) {
        // 1. Assign name and balance
        this.ownerName = ownerName;
        this.balance = initialBalance;
        // 2. Increment the global counter
        totalAccountsCreated++;
        // 3. Assign the new counter value to this account's ID
        this.accountNumber = totalAccountsCreated;
    }

    // TODO: Method to add interest
    public void addInterest() {
        this.balance += balance * interestRate;
    }

    // TODO: Static method to change interest rate
    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    // Helper to see results
    public void printDetails() {
        System.out.println("Acc #" + accountNumber + " (" + ownerName + "): $" + balance);
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Alice", 100);
        BankAccount ba2 = new BankAccount("Bob", 120);

        ba1.printDetails();
        ba2.printDetails();

        BankAccount.setInterestRate(0.10);

        ba1.addInterest();
        ba1.printDetails();

    }
}
