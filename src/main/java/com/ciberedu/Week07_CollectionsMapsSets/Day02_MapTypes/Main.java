package com.ciberedu.Week07_CollectionsMapsSets.Day02_MapTypes;

public class Main {
    public static void main(String[] args) {
        // Prueba rápida
        MapComparison comparison = new MapComparison();
        comparison.runComparison();

        // Prueba del WordCounter
        WordCounter counter = new WordCounter();
        System.out.println("\n--- Conteo de Palabras ---");
        System.out.println(counter.countWords("java es genial java es fuerte java java java"));


    }
}
