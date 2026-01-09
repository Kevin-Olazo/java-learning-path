package com.ciberedu.Week03_Polymorphism.Day04_PolymorphicArrays.Exercise;

public class Main {
    public static void main(String[] args) {

        HauntedHouse hauntedHouse = new HauntedHouse();

        Monster werewolf1 = new Werewolf();
        Monster vampire1 = new Vampire();
        Monster ghost1 = new Ghost();

        Monster ghost2 = new Ghost();
        Monster vampire2 = new Vampire();
        Monster werewolf2 = new Werewolf();

        Monster vampire3 = new Vampire();
        Monster vampire4 = new Vampire();
        Monster werewolf3 = new Werewolf();
        Monster werewolf4 = new Werewolf();

        hauntedHouse.addMonster(werewolf1);
        hauntedHouse.addMonster(vampire1);
        hauntedHouse.addMonster(ghost1);

        hauntedHouse.addMonster(ghost2);
        hauntedHouse.addMonster(vampire2);
        hauntedHouse.addMonster(werewolf2);

        hauntedHouse.addMonster(vampire3);
        hauntedHouse.addMonster(vampire4);
        hauntedHouse.addMonster(werewolf3);
        hauntedHouse.addMonster(werewolf4);

        hauntedHouse.startSpooking();

        for (Monster m : hauntedHouse.getMonsters()) {
            // Added validation to continue when monster is not null
            if (m != null) {
                hauntedHouse.destroyMonster(m);
            }

        }

    }
}
