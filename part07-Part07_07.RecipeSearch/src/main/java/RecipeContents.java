
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class RecipeContents {
    
    String recipeName;
    int recipeCookingTime;
    ArrayList<String> recipeIngredients;
    
    public RecipeContents(){
        this.recipeIngredients = new ArrayList<>();
    }
    
    public void setRecipeName(String name){
        this.recipeName = name;
    }
    
    public void setRecipeCookingTime(int time){
        this.recipeCookingTime = time;
    }
    
    public void setRecipeIngredients(String ingredient){
        this.recipeIngredients.add(ingredient);
    }
    
}
