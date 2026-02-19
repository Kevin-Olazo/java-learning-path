package com.ciberedu.Week08_ErrorHandling_FileIO.Day04_TryWithResources;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class GameSaveManager {

    private final String SAVE_FILE = "savegame.txt";
    private final String BACKUP_FILE = "backup.txt";

    public void backup() {
        try {
            Files.copy(Path.of(SAVE_FILE), Path.of(BACKUP_FILE), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("Error el escribir");
        }
    }

    public void save(GameState state) {
        backup();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SAVE_FILE))){
            writer.write(state.playerName);
            writer.newLine();
            writer.write(String.valueOf(state.level));
            writer.newLine();
            writer.write(String.valueOf(state.score));
        }  catch (IOException e){
            System.out.println("Ocurrió un error al grabar.");
        }
    }

    public GameState load() {
        // Tu try-with-resources aquí usando BufferedReader y FileReader
        try (BufferedReader reader = new BufferedReader(new FileReader(SAVE_FILE))) {

            // 1. Lee la primera línea (nombre)
            String nombre = reader.readLine();
            // 2. Lee la segunda línea y conviértela a int (nivel)
            int nivel = Integer.parseInt(reader.readLine());
            // 3. Lee la tercera línea y conviértela a int (puntaje)
            int score = Integer.parseInt(reader.readLine());
            // 4. Crea un nuevo objeto GameState con esos 3 datos y haz un 'return'
            return new GameState(nombre, nivel, score);
        } catch (NumberFormatException e){
            System.out.println("Error al guardar nivel/score");
        } catch (IOException e) {
            System.out.println("Error al cargar la partida");
        }

        // Si ocurre un error o el archivo no existe, retornamos null
        return null;
    }
}

