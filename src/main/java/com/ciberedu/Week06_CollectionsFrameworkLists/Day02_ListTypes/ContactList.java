package com.ciberedu.Week06_CollectionsFrameworkLists.Day02_ListTypes;

import java.util.ArrayList;
import java.util.List;

// PARTE 1: Optimizado para lectura rápida
class ContactList {
    // TODO: Declara la lista usando ArrayList
    private List<String> contacts;

    public ContactList() {
        // TODO: Inicializa 'contacts' como un nuevo ArrayList
        contacts = new ArrayList<>();
    }

    public void addContact(String name) {
        // Añade el nombre a la lista
        contacts.add(name);
    }

    // El ArrayList brilla aquí: Acceso directo
    public String getContactAt(int index) {
        // TODO: Retorna el contacto en el índice 'index'
        // Pista: Usa el método .get()
        return contacts.get(index);
    }

    public int size() {
        // TODO: Retorna cuántos contactos hay
        return contacts.size();
    }
}
