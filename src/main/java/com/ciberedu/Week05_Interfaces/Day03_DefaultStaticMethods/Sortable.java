package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods;

public interface Sortable {

    default void reset(){
        System.out.println("Resetting sort...");
    }
}
