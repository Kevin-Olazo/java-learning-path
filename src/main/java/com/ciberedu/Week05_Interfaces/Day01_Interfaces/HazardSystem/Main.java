package com.ciberedu.Week05_Interfaces.Day01_Interfaces.HazardSystem;

import com.ciberedu.Week05_Interfaces.Day01_Interfaces.Character;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Collidable> lista = new ArrayList<>();

        Collidable hero = new Hero();
        Collidable monster = new Monster();
        Collidable spike = new SpikePit();

        lista.add(hero);
        lista.add(monster);
        lista.add(spike);

        for (Collidable c : lista) {
           c.onCollision(c);
        }
    }
}
