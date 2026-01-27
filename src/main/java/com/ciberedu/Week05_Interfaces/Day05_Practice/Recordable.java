package com.ciberedu.Week05_Interfaces.Day05_Practice;

public interface Recordable {

    default void log(){
        System.out.println("This was recorded at: ");
    }
}
