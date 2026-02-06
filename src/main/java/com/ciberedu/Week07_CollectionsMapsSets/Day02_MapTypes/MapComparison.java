package com.ciberedu.Week07_CollectionsMapsSets.Day02_MapTypes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparison {

    /**
     * Inserta los mismos datos en los 3 tipos de mapas e imprime el resultado.
     * Datos sugeridos para insertar (en este orden): "Java", "Python", "C++", "Go".
     */
    public void runComparison() {
        // TODO: Declara los 3 mapas (HashMap, LinkedHashMap, TreeMap)
        Map<String,Integer> mapa = new HashMap<>();
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        // TODO: Inserta EXACTAMENTE los mismos datos en los 3
        String valor1 = "Java";
        Integer numero1 = 10;

        String valor2 = "Python";
        Integer numero2 = 22;

        String valor3 = "C++";
        Integer numero3 = 18;

        String valor4 = "Go";
        Integer numero4 = 55;

        mapa.put(valor1,numero1);
        mapa.put(valor2,numero2);
        mapa.put(valor3,numero3);
        mapa.put(valor4,numero4);

        linkedMap.put(valor1,numero1);
        linkedMap.put(valor2,numero2);
        linkedMap.put(valor3,numero3);
        linkedMap.put(valor4,numero4);

        treeMap.put(valor1,numero1);
        treeMap.put(valor2,numero2);
        treeMap.put(valor3,numero3);
        treeMap.put(valor4,numero4);


        // TODO: Imprime los 3 mapas para ver la diferencia de orden visualmente
        System.out.println("--- Comparación de Orden ---");
        System.out.println("Hash: " + mapa);
        System.out.println("Linked: " + linkedMap);
        System.out.println("Tree: " + treeMap);
    }

}