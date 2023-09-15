
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

        while (true) {
            System.out.print("File to read: ");
            String fileName = scanner.nextLine();
            
            System.out.println("");
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("");
            System.out.println("Enter command:");
            String userCommand = scanner.nextLine();
            
            if(userCommand.equals("stop")){
                break;
            }else if(userCommand.equals("list")){
                recipe.list(fileName);
            }
            
        }

    }

}
