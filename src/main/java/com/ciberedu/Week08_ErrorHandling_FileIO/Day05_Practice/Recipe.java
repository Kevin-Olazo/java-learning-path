package com.ciberedu.Week08_ErrorHandling_FileIO.Day05_Practice;

import java.util.List;

public class Recipe {

    private String name;
    private List<String> ingredients;
    private int minutes;

    public Recipe(String name, List<String> ingredients, int minutes) {
        this.name = name;
        this.ingredients = ingredients;
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
