package com.ciberedu.Week05_Interfaces.Day01_Interfaces.HazardSystem;

import com.ciberedu.Week05_Interfaces.Day01_Interfaces.Character;

public class Hero extends Character implements Collidable {


    @Override
    public void onCollision(Collidable other) {
        System.out.println("Ouch! Hit " + other.getClass().getSimpleName());
    }
}
