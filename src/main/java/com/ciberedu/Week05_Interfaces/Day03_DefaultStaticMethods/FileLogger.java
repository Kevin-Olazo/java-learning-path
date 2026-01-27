package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods;

public class FileLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println("Writing to file: " + msg);
    }
}
