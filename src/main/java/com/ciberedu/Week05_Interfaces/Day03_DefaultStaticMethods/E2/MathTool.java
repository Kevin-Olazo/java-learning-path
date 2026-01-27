package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods.E2;

public interface MathTool {
    default int add (int a, int b){
        return a + b;
    }

    static void printVersion(){
        System.out.println("Version 1.0");
    }
}
