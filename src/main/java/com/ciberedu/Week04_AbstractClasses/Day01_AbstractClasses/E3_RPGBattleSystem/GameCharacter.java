package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E3_RPGBattleSystem;

public abstract class GameCharacter {
    private String name;
    private int health;

    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("damage amount cannot be negative.");
        }

        this.health = this.health - amount;
        if (this.health <= 0) {
            System.out.println(name + " has been defeated!" + "💀");
        } else {
            System.out.println(name + " took " + amount + " of damage! Health is now: " + health);
        }

    }

    public abstract void attack(GameCharacter opponent);
    public abstract void specialAbility(GameCharacter opponent);
    public abstract void specialAbility();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
