package com.ciberedu.Week07_CollectionsMapsSets.Day02_MapTypes;


import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    /**
     * Recibe un texto y devuelve un Mapa con la palabra y su frecuencia.
     * Ejemplo: "hola mundo hola" -> {hola=2, mundo=1}
     * REQUISITO: Usa la implementación más rápida.
     */
    public Map<String, Integer> countWords(String text) {
        // TODO: Separa el texto en palabras (puedes usar text.split(" "))
        // TODO: Itera y guarda el conteo en un Mapa
        String[] words = text.split(" ");

        Map<String, Integer> map = new HashMap<>();


        for (String w : words) {

            if (map.containsKey(w)) {
                int numberWords = map.get(w);
                map.put(w, ++numberWords);
            } else {
                map.put(w, 1);
            }
        }
        return map;
    }
}
