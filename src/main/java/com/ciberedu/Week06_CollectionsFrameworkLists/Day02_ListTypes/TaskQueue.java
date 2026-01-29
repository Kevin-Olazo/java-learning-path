package com.ciberedu.Week06_CollectionsFrameworkLists.Day02_ListTypes;

import java.util.LinkedList;

// PARTE 2: Optimizado para manipulación de extremos
class TaskQueue {
    // TODO: Declara la lista usando LinkedList
    // (Usamos el tipo concreto LinkedList para acceder a métodos como removeFirst)
    private LinkedList<String> tasks;

    public TaskQueue() {
        // TODO: Inicializa 'tasks' como una nueva LinkedList
        tasks = new LinkedList<>();
    }

    public void addTask(String task) {
        // TODO: Agrega la tarea al final
        tasks.add(task);
    }

    // La LinkedList brilla aquí: Modificar extremos es barato
    public void completeTask() {
        // TODO: Elimina la PRIMERA tarea de la lista (la más antigua)
        // Pista: LinkedList tiene un método especial .removeFirst()
        tasks.removeFirst();
    }

    public String getNextTask() {
        // TODO: Retorna la primera tarea sin borrarla, o "No tasks" si está vacía
        if (tasks.isEmpty()){
            return "No tasks";
        }
        return tasks.getFirst();
    }
}
