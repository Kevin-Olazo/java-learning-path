package com.ciberedu.Week05_Interfaces.Day05_Practice;

public interface Playable {

    default void log(){
        System.out.println("Started playing at : ");
    }
}
