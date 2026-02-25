package com.ciberedu.Week08_ErrorHandling_FileIO.Day03_FileIO;

// 1. Clase simple para guardar los datos (POJO)
public class Exercise {
    private String date;
    private String name;
    private int sets;
    private int reps;
    private double weight;

    // TODO: Constructor, Getters y un método toString() útil
    public Exercise(String date, String name, int sets, int reps, double weight) {
        this.date = date;
        this.name = name;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
    }

    public Exercise() {
    }

    // Ayuda para escribir en CSV fácilmente
    public String toCSV() {
        return date + "," + name + "," + sets + "," + reps + "," + weight;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}