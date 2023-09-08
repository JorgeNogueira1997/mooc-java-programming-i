/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String userInput = scanner.nextLine();

            if (userInput.equals("X")) {
                break;
            } else if (userInput.equals("1")) {
                System.out.println("Write the joke to be added:");
                String newJoke = this.scanner.nextLine();
                this.manager.addJoke(newJoke);
                
            } else if (userInput.equals("2")) {
                System.out.println(this.manager.drawJoke());
                
            } else if (userInput.equals("3")) {
                this.manager.printJokes();
            }
        }

    }

}
