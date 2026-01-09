package com.ciberedu.Week03_Polymorphism.Day04_PolymorphicArrays.Exercise;

public class HauntedHouse {
    private Monster[] monsters = new Monster[10];
    int monsterCount = 0;

    public HauntedHouse() {
    }

    public Monster[] getMonsters() {
        return monsters;
    }

    public int getMonsterCount() {
        return monsterCount;
    }

    public void addMonster(Monster m) {
        if (m == null) {
            throw new IllegalArgumentException("Monster cannot be null");
        }

        if (monsterCount < monsters.length) {
            monsters[monsterCount] = m;
            monsterCount++;
        }
    }

    public void startSpooking() {
        for (Monster m : monsters) {
            if (m == null) {
                break;
            }
            m.makeNoise();
        }
    }

    public void destroyMonster(Monster m) {
        if (m == null) {
            throw new IllegalArgumentException("Monster cannot be null");
        }

        if (m instanceof Vampire) {
            System.out.println("Using wooden stake!");
        } else if (m instanceof Werewolf) {
            System.out.println("Using silver bullet!");
        } else if (m instanceof Ghost) {
            System.out.println("Using salt and iron!");
        }
    }
}
