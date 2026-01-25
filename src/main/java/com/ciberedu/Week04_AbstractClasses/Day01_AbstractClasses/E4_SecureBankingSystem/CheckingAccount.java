package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E4_SecureBankingSystem;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, String holderName, double overdraftLimit) {
        super(accountNumber, balance, holderName);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() - amount >= overdraftLimit * -1){
            setBalance(getBalance() - amount);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void applyEndOfMonth() {
        if (getBalance() < 0) {
            setBalance(getBalance() - 20);
            System.out.println("Overdraft fee applied.");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
