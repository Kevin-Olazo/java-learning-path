package com.ciberedu.Week04_AbstractClasses.Day05_Practice.GameCharacterSystem;

public class Archer extends Character {

    public Archer(String name) {
        super(90, 12, name);
    }


    @Override
    public void attack() {
        System.out.println("Shoots an arrow, causes " + getBaseDamage() + " damage.");
    }

    @Override
    public void defend() {
        System.out.println("Raises his shield!");
    }

}
