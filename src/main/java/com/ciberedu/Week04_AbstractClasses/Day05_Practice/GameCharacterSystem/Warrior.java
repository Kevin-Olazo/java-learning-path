package com.ciberedu.Week04_AbstractClasses.Day05_Practice.GameCharacterSystem;

public class Warrior extends Character {

    // Default values
    public Warrior(String name) {
        super(150, 15, name);
    }



    @Override
    public void attack() {
        System.out.println("Swings sword with " + getBaseDamage() + " damage!");
    }

    @Override
    public void defend() {
        System.out.println("Raises shield!");
    }
}
