package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E3_RPGBattleSystem;

public class Paladin extends GameCharacter{
    private int faithPoints;

    public Paladin(String name, int health, int faithPoints) {
        super(name, health);
        this.faithPoints = faithPoints;
    }

    @Override
    public void attack(GameCharacter opponent) {
        if (opponent.getHealth() > 0) {
            opponent.takeDamage(10);
            faithPoints += 5;
        } else {
            System.out.println("Opponent has already been defeated");
        }

    }

    @Override
    public void specialAbility(GameCharacter opponent) {

    }

    @Override
    public void specialAbility() {
        if (faithPoints >= 20) {
            setHealth(getHealth() + 15);
            System.out.println("Healed 15HP!");
        } else {
            System.out.println("Not enough faith!");
        }

    }
}
