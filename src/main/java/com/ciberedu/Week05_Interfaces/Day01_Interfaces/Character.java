package com.ciberedu.Week05_Interfaces.Day01_Interfaces;

public class Character implements Drawable, Movable {

    @Override
    public void draw() {
        System.out.println("Drawing Character");
    }

    @Override
    public void move() {
        System.out.println("Moving Character");
    }
}
