
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jorge
 */
public class Recipe {

    ArrayList<String> fileContent;
    ArrayList<RecipeContents> recipeContents;
    RecipeContents currentRecipeBeingRead;

    public Recipe() {
        this.fileContent = new ArrayList<>();
        this.recipeContents = new ArrayList<>();
        this.currentRecipeBeingRead = null;
    }

    public void list(String fileName) {

        try ( Scanner x = new Scanner(Paths.get(fileName))) {
            while (x.hasNextLine()) {
                //String aux = x.nextLine();
                //this.recipeContents.add(aux);
                //System.out.println(aux);

                // objeto para cada receita nova a ser lida
                RecipeContents recipe = new RecipeContents();

                // ler nome da receita
                String recipeName = x.nextLine();
                if (recipeName.isEmpty()) { // ignora linha em branco
                    continue;
                }
                recipe.setRecipeName(recipeName);

                // ler tempo de cozedura
                String cookingTimeStr = x.nextLine();
                int cookingTime = Integer.valueOf(cookingTimeStr);
                recipe.setRecipeCookingTime(cookingTime);

                // ler ingredientes
                while (x.hasNextLine()) {
                    String ingredient = x.nextLine();
                    if (ingredient.isEmpty()) {
                        break; // End of ingredients for this recipe
                    }
                    recipe.setRecipeIngredients(ingredient);
                }

                // adiciona o objeto ao array
                this.recipeContents.add(recipe);

            }

            //printRecipes();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void printRecipes() {
        System.out.println("Recipes:");
        for (RecipeContents recipe : this.recipeContents) {
            System.out.println(recipe.getRecipeName()
                    + ", cooking time: " + recipe.getRecipeCookingTime());
            /*
            System.out.println(recipe.getRecipeName() + 
                    ", cooking time: " + recipe.getRecipeCookingTime() + 
                    ", " + recipe.getRecipeIngredients()); */
        }
    }

    public void findName(String userInput) {
        for (int i = 0; i < this.recipeContents.size(); i++) {
            RecipeContents recipeName = this.recipeContents.get(i);

            //System.out.println("recipeName.getRecipeName(): " + recipeName.getRecipeName());
            if (recipeName.getRecipeName().contains(userInput)) {
                System.out.println("");
                System.out.println("Recipes:");
                System.out.println(recipeName.getRecipeName()
                        + ", cooking time: " + recipeName.getRecipeCookingTime());
            }
        }
    }

    public void findMaxCookingTime(int maxCookingTime) {
        System.out.println("");
        System.out.println("Recipes:");
        for (int i = 0; i < this.recipeContents.size(); i++) {
            RecipeContents auxTime = this.recipeContents.get(i);

            if (auxTime.getRecipeCookingTime() <= maxCookingTime) {
                System.out.println(auxTime.getRecipeName()
                        + ", cooking time: " + auxTime.getRecipeCookingTime());
            }
        }
    }

    public void findIngredient(String userIngredient) {
        System.out.println("");
        System.out.println("Recipes: ");

        for (int i = 0; i < this.recipeContents.size(); i++) {
            RecipeContents auxIngredient = this.recipeContents.get(i);

            if (auxIngredient.getRecipeIngredients().contains(userIngredient)) {
                System.out.println(auxIngredient.getRecipeName()
                        + ", cooking time: " + auxIngredient.getRecipeCookingTime());
            }

        }

    }

}
