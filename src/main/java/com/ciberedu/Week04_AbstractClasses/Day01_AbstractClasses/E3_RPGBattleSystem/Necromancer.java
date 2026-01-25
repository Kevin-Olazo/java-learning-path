package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E3_RPGBattleSystem;

public class Necromancer extends GameCharacter {
    private int soulsCollected = 0;

    public Necromancer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(GameCharacter opponent) {
        opponent.takeDamage(5);
        if (opponent.getHealth() < 10) {
            System.out.println("Soul harvested!");
            soulsCollected++;
        }
    }

    @Override
    public void specialAbility() {

    }

    @Override
    public void specialAbility(GameCharacter opponent) {
        if (soulsCollected > 0) {
            opponent.takeDamage(20);
            soulsCollected--;
        } else {
            System.out.println("No souls to burn!");
        }
    }

    public int getSoulsCollected() {
        return soulsCollected;
    }

    public void setSoulsCollected(int soulsCollected) {
        this.soulsCollected = soulsCollected;
    }
}
