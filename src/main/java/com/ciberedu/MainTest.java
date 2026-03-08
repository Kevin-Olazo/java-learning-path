package com.ciberedu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class MainTest {

    public static void main(String[] args) throws IOException {
        // 1. Crea scanner
        Scanner in = new Scanner(System.in);
        // 2. Obtenemos el numero de contactos (n)
        int n = in.nextInt();
        in.nextLine();
        // 3. Creo el mapa para agregar los contactos
        Map<String, Integer> phoneBook = new HashMap<>();

        // 4. Itero la cantidad de veces (n) para agregar contactos
        for(int i = 0; i < n; i++){
            // 4.1. Obtengo el nombre
            String name = in.next();
            // 4.2. Obtengo el telefono
            int phone = in.nextInt();
            // Write code here
            in.nextLine();
            phoneBook.put(name, phone);
        }

        // 5. While loop para ingresar busqueda de nombre para obtener contacto
        while(in.hasNext()){
            // 5.1. Obtengo el nombre de contacto
            String s = in.next();
            // Write code here
            if(phoneBook.containsKey(s)){
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found!");
            }

        }

        in.close();
    }


}
