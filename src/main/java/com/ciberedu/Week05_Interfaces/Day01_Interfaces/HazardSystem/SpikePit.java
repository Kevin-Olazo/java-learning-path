package com.ciberedu.Week05_Interfaces.Day01_Interfaces.HazardSystem;

import com.ciberedu.Week05_Interfaces.Day01_Interfaces.Drawable;


public class SpikePit implements Drawable, Collidable {



    @Override
    public void draw() {

    }

    @Override
    public void onCollision(Collidable other) {
        System.out.println("Impaling " + other.getClass().getSimpleName());
    }
}
