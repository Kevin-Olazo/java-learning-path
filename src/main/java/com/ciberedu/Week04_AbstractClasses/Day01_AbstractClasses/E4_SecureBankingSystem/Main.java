package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E4_SecureBankingSystem;

public class Main {
    public static void main(String[] args) {


        BankAccount ca1 = new CheckingAccount("101", 100.00, "Daniel", 500);
        BankAccount sa1 = new SavingsAccount("102", 3000.00, "Jose", 0.05);

        ca1.transfer(sa1, 100);
        ca1.transfer(sa1, 500);

        ca1.transfer(sa1,1000);

    }
}
