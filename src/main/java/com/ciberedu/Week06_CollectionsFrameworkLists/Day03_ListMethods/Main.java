package com.ciberedu.Week06_CollectionsFrameworkLists.Day03_ListMethods;

public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();

        // 1. Guardamos las referencias al crearlas
        Task t1 = new Task("Comprar ropa");
        Task t2 = new Task("Lavar platos");

        // 2. Las agregamos
        tm.addTask(t1); // (Asumiendo que ajustaste addTask para recibir Task)
        tm.addTask(t2);

        // 3. Modificamos usando la referencia que ya tenemos
        t1.complete(); // Marcamos t1 como completa

        // 4. Ahora probamos el borrado
        System.out.println("Total antes: " + tm.getTotalTasks());
        tm.removeCompletedTasks();
        System.out.println("Total después: " + tm.getTotalTasks()); // Debería bajar a 1
    }
}