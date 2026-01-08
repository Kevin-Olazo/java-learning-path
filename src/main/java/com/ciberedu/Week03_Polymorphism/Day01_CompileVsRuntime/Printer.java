package com.ciberedu.Week03_Polymorphism.Day01_CompileVsRuntime;

public class Printer {

    // The Compile-Time Demo

    void printData(int transactionNumber) {
        System.out.println("Transaction number: " + transactionNumber);
    }

    void printData(String ID) {
        System.out.println("ID: " + ID);
    }

    void printData(double cost) {
        System.out.println("Total cost: " + cost);
    }

}
