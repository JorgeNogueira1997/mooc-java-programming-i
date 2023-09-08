
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int auxUser = 0;
        int positiveNumbers = 0;
        int sumNumbers = 0;   // soma dos numeros todos introduzidos pelo user
        int totalNumbers = 0; // number of numbers introduced by the user
        double avgNumbers = 0;

        while (true) {
            auxUser = Integer.valueOf(scanner.nextLine());

            if (auxUser == 0) {
                if (sumNumbers == 0) {
                    System.out.println("Cannot calculate the average");
                }
                break; // exit the loop
            } else { // number != 0 (negative or positive number)
                if (auxUser > 0) { // only store the positive numbers for the average of the positive numbers
                    totalNumbers++; // increment total
                    sumNumbers = sumNumbers + auxUser; // add for the average
                } else { // means no positive number was written by user

                    // since i only do math with positive numbers, if here 
                    // sumNumbers == 0 it means no positive number was iputted
                    if (auxUser == 0 && sumNumbers == 0) {
                        System.out.println("Cannot calculate the average");
                        break;
                    }
                }
            }
            // The average of the numbers can be calculated by:
            // dividing the sum of numbers with the amount of the numbers
            avgNumbers = ((double) sumNumbers / totalNumbers);
        }
        if (totalNumbers != 0) { // only prints if at least 1 number was introduced
            System.out.println(avgNumbers);
            //System.out.println("totalNumbers: "+totalNumbers);
            //System.out.println("sumNumbers: "+sumNumbers);
        }
    }
}
