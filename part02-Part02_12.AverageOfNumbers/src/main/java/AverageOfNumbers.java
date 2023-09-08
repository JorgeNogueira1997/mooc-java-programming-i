
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int auxUser = 0; // "You may assume that the user inputs at least one number."
        int sumNumbers = 0;
        int totalNumbers = 0;
        double avgNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            auxUser = Integer.valueOf(scanner.nextLine());

            if (auxUser == 0) {
                break;
            } else {
                sumNumbers++;
                totalNumbers = totalNumbers + (auxUser);
            }
            // The average of the numbers can be calculated by:
            // dividing the sum of numbers with the amount of the numbers
            avgNumbers = ((double)totalNumbers / sumNumbers);
        }
        System.out.println("Average of the numbers: " + avgNumbers);
        //System.out.println("sumNumbers: "+ sumNumbers);
        //System.out.println("totalNumbers: "+ totalNumbers);

    }
}
