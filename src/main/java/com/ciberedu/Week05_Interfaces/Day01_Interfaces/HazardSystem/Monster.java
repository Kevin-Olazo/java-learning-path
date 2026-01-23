package com.ciberedu.Week05_Interfaces.Day01_Interfaces.HazardSystem;

import com.ciberedu.Week05_Interfaces.Day01_Interfaces.Character;
import com.ciberedu.Week05_Interfaces.Day01_Interfaces.Drawable;
import com.ciberedu.Week05_Interfaces.Day01_Interfaces.Movable;

public class Monster extends Character implements Collidable {


    @Override
    public void onCollision(Collidable other) {
        System.out.println("Attacking " + other.getClass().getSimpleName());
    }


}
