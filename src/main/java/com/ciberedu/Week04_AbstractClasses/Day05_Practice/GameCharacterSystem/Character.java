package com.ciberedu.Week04_AbstractClasses.Day05_Practice.GameCharacterSystem;

public abstract class Character {
    private int healthPoints;
    private int baseDamage;
    private String name;
    private int level;
    private int expPoints;


    public Character(int healthPoints, int baseDamage, String name) {
        this.healthPoints = healthPoints;
        this.baseDamage = baseDamage;
        this.name = name;
        this.level = 1;
        this.expPoints = 0;

    }

    public Character(int healthPoints, int baseDamage, String name, int level, int expPoints) {
        this.healthPoints = healthPoints;
        this.baseDamage = baseDamage;
        this.name = name;
        this.level = level;
        this.expPoints = expPoints;
    }

    public void displayStats() {
        System.out.println("HP: " + healthPoints + "\n Base Damage: " + baseDamage + "\n Level: " + level);
    }

    public void takeDamage(int amount) {
        healthPoints -= amount;
    }


    public abstract void attack();

    public abstract void defend();


    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExpPoints() {
        return expPoints;
    }

    public void setExpPoints(int expPoints) {
        this.expPoints = expPoints;
    }
}
