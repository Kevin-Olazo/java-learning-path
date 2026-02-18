package com.ciberedu.Week08_ErrorHandling_FileIO.Day03_FileIO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO: Testea tu código aquí
        WorkoutLog log = new WorkoutLog();

        // 1. Agregar un ejercicio de prueba
        Exercise ex1 = new Exercise("17", "Squat", 4, 10, 20  );
        Exercise ex2 = new Exercise("18", "Push", 5, 9, 32  );
        Exercise ex3 = new Exercise("19", "Pull", 6, 7, 47  );
        log.addExercise(ex1);
        log.addExercise(ex2);
        log.addExercise(ex3);
        // 2. Leer el historial y mostrarlo en consola
        List<Exercise> ejercicios = log.loadHistory();
        for (Exercise e : ejercicios){
            System.out.println(e.toCSV());
        }
    }
}
