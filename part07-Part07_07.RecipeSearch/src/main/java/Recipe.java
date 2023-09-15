
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
        this.currentRecipeBeingRead = null;
    }

    public void list(String fileName) {

        try ( Scanner scannerForFile = new Scanner(Paths.get(fileName))) {

            while (scannerForFile.hasNextLine()) {
                this.fileContent.add(scannerForFile.nextLine());
                String aux = scannerForFile.nextLine();

                if (aux.isEmpty()) { // novo ingrediente depois da linha vazia

                } else { // a linha não está vazia significa ler o nome

                    if (this.currentRecipeBeingRead == null) {
                        this.currentRecipeBeingRead = new RecipeContents();
                        this.currentRecipeBeingRead.setRecipeName(aux);
                    }else {
                        int auxCookingTime = Integer.valueOf(aux);
                        this.currentRecipeBeingRead.setRecipeCookingTime(auxCookingTime);
                    }

                }

                System.out.println(aux);
            }
            // primeira linha: nome
            // segunda linha: tempo cozedura
            // terceira linha até encontrar espaço: ingredientes

            // depois do espaço, começa outra receita...
            System.out.println("Recipes: ");
            String recipeName;
            int recipeCookingTime;
            // ingredients

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
