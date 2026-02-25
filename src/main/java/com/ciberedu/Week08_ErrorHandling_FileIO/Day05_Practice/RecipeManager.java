package com.ciberedu.Week08_ErrorHandling_FileIO.Day05_Practice;

import com.ciberedu.Week08_ErrorHandling_FileIO.Day05_Practice.exceptions.InvalidRecipeException;
import com.ciberedu.Week08_ErrorHandling_FileIO.Day05_Practice.exceptions.RecipeNotFoundException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class RecipeManager {

    private List<Recipe> recipes = new ArrayList<>();
    private static final String FILE_PATH = "recipes.txt";
    private static final String BACKUP_PATH = "recipes_backup.txt";

    public void addRecipe(Recipe recipe) throws InvalidRecipeException {
        if (recipe.getName() == null || recipe.getName().isEmpty()) {
            throw new InvalidRecipeException("El nombre de la receta no puede estar vacía");
        }

        recipes.add(recipe);
    }

    public List<Recipe> searchByIngredient(String string) throws RecipeNotFoundException {
        List<Recipe> foundRecipe = new ArrayList<>();

        for (Recipe r : recipes){
            if (r.getIngredients().contains(string)){
                foundRecipe.add(r);
            }
        }

        if (foundRecipe.isEmpty()){
            throw new RecipeNotFoundException("No se encontró ninguna receta con ese ingrediente");
        }

        return foundRecipe;

    }

    public void saveRecipes() {

        try {
            Files.copy(Path.of(FILE_PATH), Path.of(BACKUP_PATH), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("Error al guardar respaldo");
        }

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));
        ) {

            for (Recipe rec : recipes) {
                writer.write(rec.getName() + "|" + String.join(",", rec.getIngredients()) + "|" + rec.getMinutes());
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error saving recipes");
        }
    }

    public void loadRecipes() {

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String data;
            while( (data =reader.readLine()) != null){
                String[] listData = data.split("\\|");

                String nombre = listData[0];

                List<String> ingre = List.of(listData[1].split(","));

                int duracion = 0;

                try {
                    duracion = Integer.parseInt(listData[2]);

                } catch (NumberFormatException e){
                    System.out.println("Error de parseo de numero");
                }

                recipes.add(new Recipe(nombre, ingre, duracion));
            }


        } catch (IOException e) {
            System.out.println("Error al leer archivo");
        }

    }
}
