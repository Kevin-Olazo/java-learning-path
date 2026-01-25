package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods;

public interface Logger {

    default void log (String msg){
        System.out.println("Default logger: " + msg);
    }

    static boolean checkNull(String msg){
        return msg == null;
    }
}
