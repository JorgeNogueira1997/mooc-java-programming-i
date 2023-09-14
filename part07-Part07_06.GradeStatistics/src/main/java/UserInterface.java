
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
    Points userPoints;

    public UserInterface(Scanner scanner, Points userPoints) {
        this.scanner = scanner;
        this.userPoints = userPoints;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String userInput = this.scanner.nextLine();

            if (Integer.valueOf(userInput) == -1) {
                break;
            } else {
                this.userPoints.add(Integer.valueOf(userInput));
            }
        }

    }

}
