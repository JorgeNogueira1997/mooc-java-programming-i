
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
public class UserInterface {

    Scanner scanner;
    ArrayList<Bird> arrayBirds;
    Observation observation;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.observation = new Observation();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String userInput = this.scanner.nextLine();

            if (userInput.equals("Quit")) {
                break;
            } else if (userInput.equals("Add")) {

                System.out.print("Name: ");
                String birdName = this.scanner.nextLine();

                System.out.print("Name in Latin: ");
                String birdNameLatin = this.scanner.nextLine();

                Bird aux = new Bird(birdName, birdNameLatin);
                this.observation.add(aux);

            } else if (userInput.equals("Observation")) {
                System.out.print("Bird? ");
                String searchInObservation = this.scanner.nextLine();

                boolean exist = this.observation.isItABird(searchInObservation);
                if (exist == false) {
                    System.out.println("Not a bird! ");
                }

            } else if (userInput.equals("All")) {
                this.observation.printAll();

            } else if (userInput.equals("One")) {
                System.out.print("Bird? ");
                String searchOne = this.scanner.nextLine();
                
                this.observation.printOne(searchOne);
            }
        }

    }

}
