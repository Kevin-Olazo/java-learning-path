package com.ciberedu.Week06_CollectionsFrameworkLists.Day01_ArraysVsCollections;

// --- CLASE 2: La forma moderna (Flexible) ---
import java.util.ArrayList; // ¡Importante!

public class CollectionDemo {
    public static void main(String[] args) {
        // TODO 1: Crea un ArrayList usando Generics <String>
        ArrayList<String> lista = new ArrayList<>();

        // TODO 2: Agrega 3 elementos usando .add()
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("!");

        // TODO 3: Agrega un 4to elemento (¡Sin crear listas nuevas!)
        lista.add("Prueba");

        // TODO 4: Imprime el tamaño (.size()) y la lista completa.
        System.out.println(lista.size());
        for (String s : lista){
            System.out.println(s);
        }

        System.out.println(lista);

    }
}