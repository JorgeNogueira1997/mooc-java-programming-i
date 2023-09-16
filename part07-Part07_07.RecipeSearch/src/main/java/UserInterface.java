
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
public class UserInterface {

    Scanner scanner;
    Recipe recipe;

    public UserInterface(Scanner scanner, Recipe recipe) {
        this.scanner = scanner;
        this.recipe = recipe;
    }

    public void start() {

        System.out.print("File to read: ");
        String fileName = this.scanner.nextLine();

        while (true) {
            System.out.println("");
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("");
            System.out.print("Enter command: ");
            String userCommand = this.scanner.nextLine();

            if (userCommand.equals("stop")) {
                break;
            } else if (userCommand.equals("list")) {
                this.recipe.list(fileName);
                this.recipe.printRecipes();
                
            } else if (userCommand.equals("find name")) {
                this.recipe.list(fileName);

                System.out.print("Searched word: ");
                String userInput = this.scanner.nextLine();
                this.recipe.findName(userInput);
                
            }else if(userCommand.equals("find cooking time")){
                this.recipe.list(fileName);
                
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(this.scanner.nextLine());
                this.recipe.findMaxCookingTime(maxCookingTime);
                
            }else if(userCommand.equals("find ingredient")){
                this.recipe.list(fileName);
                
                System.out.print("Ingredient: ");
                String userIngredient = this.scanner.nextLine();
                
                this.recipe.findIngredient(userIngredient);
            }

        }

    }

}
