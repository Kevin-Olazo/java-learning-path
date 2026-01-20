package com.ciberedu.Week04_AbstractClasses.Day05_Practice.GameCharacterSystem;

public class Mage extends Character {

    public Mage(String name) {
        super(50, 30, name);
    }


    @Override
    public void attack() {
        System.out.println("Casts fireball doing " + getBaseDamage() + " damage.");
    }

    @Override
    public void defend() {
        System.out.println("Created a magical barrier!");
    }
}
