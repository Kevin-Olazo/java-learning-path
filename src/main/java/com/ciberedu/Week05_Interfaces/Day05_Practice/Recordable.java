package com.ciberedu.Week05_Interfaces.Day05_Practice;

public interface Recordable {

    void record();

    default void reset(){
        System.out.println("Resetting recorder...");
    }


}
