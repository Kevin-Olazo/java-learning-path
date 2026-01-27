package com.ciberedu.Week05_Interfaces.Day05_Practice;

public interface Playable {

    void play();

    default void reset(){
        System.out.println("Resetting player...");
    }

}
