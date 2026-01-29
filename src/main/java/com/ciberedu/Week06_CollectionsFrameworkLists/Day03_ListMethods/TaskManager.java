package com.ciberedu.Week06_CollectionsFrameworkLists.Day03_ListMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public int getTotalTasks() {
        if (tasks.isEmpty()){
            return 0;
        }
        return tasks.size();
    }

    public void removeCompletedTasks() {
        Iterator<Task> it = tasks.iterator();
        while (it.hasNext()) {
            Task t = it.next();
            if (t.isComplete) {
                it.remove();
                System.out.println("Tarea eliminada: " + t.title);
            }
        }
    }


    public void triggerCrash() {
        System.out.println("Intentando borrar con for-each (esto debería fallar)...");
        // TODO: Escribe el for-each que falla al hacer remove()
        for (Task t : tasks) {
            tasks.remove(t);
        }
    }

    public void printAll() {
        // TODO: Usa un Enhanced For-Loop (for-each) aquí solo para LECTURA
        for (Task t : tasks) {
            System.out.println(t.toString());
        }
    }
}