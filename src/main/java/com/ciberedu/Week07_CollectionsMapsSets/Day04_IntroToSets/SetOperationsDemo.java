package com.ciberedu.Week07_CollectionsMapsSets.Day04_IntroToSets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperationsDemo {
    public static void main(String[] args) {
        // Preparación de datos
        Set<String> setA = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        Set<String> setB = new HashSet<>(Arrays.asList("Python", "C#", "Ruby"));

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        // TODO 1: UNIÓN (Mostrar todos los lenguajes de A y B sin repetir)
        // Pista: usa addAll() en una copia del set
        Set<String> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        System.out.println(unionSet);


        // TODO 2: INTERSECCIÓN (Mostrar solo los lenguajes comunes: Python)
        // Pista: usa retainAll()
        Set<String> interSet = new HashSet<>(setA);
        interSet.retainAll(setB);
        System.out.println(interSet);


        // TODO 3: DIFERENCIA (Mostrar lo que tiene A pero NO tiene B)
        // Pista: usa removeAll()
        Set<String> treeSet = new HashSet<>(setA);
        treeSet.removeAll(setB);
        System.out.println(treeSet);


        TagManager tm = new TagManager();

        tm.addTag("Ruby");
        tm.addTag("Hola");
        tm.addTag("Java");
        tm.addTag("Burro");
        tm.addTag("java");
        tm.addTag("Python");
        tm.addTag("Alejus");
        tm.addTag("JavA");

        System.out.println(tm.tagExists("Java"));

        tm.printTagsStored();
    }
}
