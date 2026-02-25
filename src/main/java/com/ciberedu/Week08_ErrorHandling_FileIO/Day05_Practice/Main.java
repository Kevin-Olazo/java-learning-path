package com.ciberedu.Week08_ErrorHandling_FileIO.Day05_Practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        RecipeManager recipeManager = new RecipeManager();

        List<String> ing1 = new ArrayList<>();
        ing1.add("bread");
        ing1.add("tomato");

        List<String> ing2 = new ArrayList<>();
        ing2.add("rice");
        ing2.add("chicken");

        Recipe rec1 = new Recipe("Pizza", ing1, 30);
        Recipe rec2 = new Recipe("arroz", ing2, 44);

        recipeManager.addRecipe(rec1);
        recipeManager.addRecipe(rec2);

        recipeManager.saveRecipes();

        recipeManager.loadRecipes();

    }


}
