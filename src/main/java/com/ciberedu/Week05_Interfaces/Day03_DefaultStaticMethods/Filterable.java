package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods;

public interface Filterable {

    default void reset(){
        System.out.println("Resetting filter...");
    }
}
