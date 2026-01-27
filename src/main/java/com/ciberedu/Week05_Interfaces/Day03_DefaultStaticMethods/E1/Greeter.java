package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods.E1;

public interface Greeter {
    default void sayHello(){
        System.out.println("Hello from Interface!");
    }
}
