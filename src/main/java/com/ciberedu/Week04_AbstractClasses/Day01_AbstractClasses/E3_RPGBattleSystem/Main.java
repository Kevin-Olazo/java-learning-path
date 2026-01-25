package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E3_RPGBattleSystem;

public class Main {
    public static void main(String[] args) {
        GameCharacter paladin = new Paladin("Arthur", 50, 0);

        GameCharacter necro = new Necromancer("Sauron", 50);

        paladin.attack(necro);
        necro.attack(paladin);
        paladin.attack(necro);
        necro.attack(paladin);

        paladin.specialAbility();
        necro.specialAbility(paladin);
    }
}
