package com.ciberedu.Week04_AbstractClasses.Day04_RefactoringToAbstract;

public abstract class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public void saveToDatabase() {
        System.out.println("Saving payment #" + transactionId + " to database...");
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }
}
