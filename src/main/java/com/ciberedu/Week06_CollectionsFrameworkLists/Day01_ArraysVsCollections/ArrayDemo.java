package com.ciberedu.Week06_CollectionsFrameworkLists.Day01_ArraysVsCollections;

// --- CLASE 1: La forma antigua (Dolorosa) ---
public class ArrayDemo {
    public static void main(String[] args) {
        // TODO 1: Crea un Array de Strings de tamaño fijo (ej: 3)
        String[] lista = new String[3];

        // TODO 2: Llénalo con 3 elementos
        lista[0] = "Hola";
        lista[1] = "Mundo";
        lista[2] = "!";

        // TODO 3: Simula que necesitas agregar un 4to elemento.
        // Como no cabe, crea un NUEVO array más grande (tamaño 4 o 5).
        //lista[3] = "Prueba";
        String[] listaNueva = new String[4];

        // TODO 4: Copia manualmente los datos del viejo al nuevo.
        listaNueva[0] = lista[0];
        listaNueva[1] = lista[1];
        listaNueva[2] = lista[2];

        // TODO 5: Agrega el nuevo elemento y muestra el resultado.

        listaNueva[3] = "Prueba";

        for (String s : listaNueva) {
            System.out.println(s);
        }
    }
}