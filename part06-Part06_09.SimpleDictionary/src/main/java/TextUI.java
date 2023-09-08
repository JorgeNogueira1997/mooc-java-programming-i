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

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            } else if (command.equals("add")) {

                System.out.print("Word: ");
                String userWord = scanner.nextLine();

                System.out.print("Translation: ");
                String userTranslation = scanner.nextLine();

                dictionary.add(userWord, userTranslation);

            } else if (command.equals("search")) {
                System.out.print("To be translated: ");

                String userToBeTranslated = scanner.nextLine();

                String cleanUp = this.dictionary.translate(userToBeTranslated);

                //System.out.println("cleanUp: " + cleanUp);

                /*
                i've tried:
                cleanUp.equals("null") - throws NullPointerException
                cleanUp.equals(null) - throws NullPointerException
                cleanUp.isEmpty() - throws NullPointerException
                
                the correct is:
                cleanUp == null 
                 */
                if (cleanUp == null) {
                    System.out.println("Word " + userToBeTranslated + " was not found");
                } else {
                    System.out.println(cleanUp);
                }
            } else {
                System.out.println("Unknown command");
            }

        }

    }

}
