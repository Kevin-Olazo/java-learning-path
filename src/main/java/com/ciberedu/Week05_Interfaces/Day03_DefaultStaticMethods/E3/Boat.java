package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods.E3;

public interface Boat {
    default void drive(){
        System.out.println("Sailing on water");
    }
}
