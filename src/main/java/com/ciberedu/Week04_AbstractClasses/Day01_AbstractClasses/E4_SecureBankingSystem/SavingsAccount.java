package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E4_SecureBankingSystem;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String holderName, double interestRate) {
        super(accountNumber, balance, holderName);
        this.interestRate = interestRate;
    }


    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Enter a valid amount to withdraw");
        }


        if (amount > getBalance()) {
            return false;
        } else {
            setBalance(getBalance() - amount);
            return true;
        }

    }

    @Override
    public void applyEndOfMonth() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println("Interest applied.");
    }
}
