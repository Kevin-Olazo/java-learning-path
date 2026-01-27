package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods.E2;

public class MathDemo {
    public static void main(String[] args) {
        MathTool.printVersion();

        SmartCalculator sc = new SmartCalculator();



        System.out.println(sc.add(1,2));

    }
}
