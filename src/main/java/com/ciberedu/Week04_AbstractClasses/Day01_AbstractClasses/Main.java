package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses;

public class Main {
    public static void main(String[] args) {
        //
        Employee genericGuy = new SalariedEmployee("John Doe",  999, 125000);

        genericGuy.clockIn();
        genericGuy.printPaycheck();
        System.out.println(genericGuy.getJobDescription());
        System.out.println(genericGuy.calculatePay());
    }
}
