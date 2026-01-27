package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods.E2;

public class SmartCalculator implements MathTool {

    @Override
    public int add(int a, int b) {
        System.out.println("Adding numbers: ");
        return MathTool.super.add(a, b);
    }
}
