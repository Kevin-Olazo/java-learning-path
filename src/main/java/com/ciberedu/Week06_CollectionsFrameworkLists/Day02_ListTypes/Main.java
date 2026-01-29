package com.ciberedu.Week06_CollectionsFrameworkLists.Day02_ListTypes;

public class Main {
    public static void main(String[] args) {
        // TODO: Aquí probarás tus clases
        // 1. Crea un ContactList, agrega 3 amigos y muestra el 2do amigo.
        // 2. Crea un TaskQueue, agrega 3 tareas, completa 1 y muestra cuál sigue.

        ContactList contactList = new ContactList();

        contactList.addContact("John");
        contactList.addContact("Maria");
        contactList.addContact("Andre");

        TaskQueue taskQueue = new TaskQueue();

        taskQueue.addTask("Comprar ropa");
        taskQueue.addTask("Lavar platos");
        taskQueue.addTask("Pasear al perro");


        System.out.println("--- Probando Código ---");

        System.out.println(contactList.getContactAt(1));


        taskQueue.completeTask();
        taskQueue.completeTask();
        System.out.println(taskQueue.getNextTask());

    }
}