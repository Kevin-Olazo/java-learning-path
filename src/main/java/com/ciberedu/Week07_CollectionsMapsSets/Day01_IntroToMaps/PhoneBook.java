package com.ciberedu.Week07_CollectionsMapsSets.Day01_IntroToMaps;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    // 1. Declara el Map (Clave: Nombre, Valor: Teléfono)
    private Map<String, String> contacts;

    public PhoneBook() {
        // 2. Inicializa el HashMap aquí
        this.contacts = new HashMap<>();
    }

    // Guardar contacto
    public void addContact(String name, String phoneNumber) {
        // TODO: Usa put()
        this.contacts.put(name, phoneNumber);
    }

    // Buscar contacto
    public String findPhoneNumber(String name) {
        // TODO: Usa get().
        // Reto extra: Si el contacto no existe, devuelve "No encontrado".
        if (this.contacts.get(name) == null) {
            return "No encontrado";
        }
        return this.contacts.get(name);
    }

    // Borrar contacto
    public void removeContact(String name) {
        // TODO: Investiga qué método del Map sirve para borrar (es intuitivo)
        this.contacts.remove(name);
    }

    // Listar todos
    public void printAllContacts() {
        // TODO: Recorre el mapa e imprime "Nombre -> Teléfono" para cada uno.
        // Pista: Necesitarás un bucle (for-each) sobre .keySet() o .entrySet()
        for(String c : contacts.keySet()){
            System.out.println(c + " -> " + findPhoneNumber(c) );
        }
    }
}
