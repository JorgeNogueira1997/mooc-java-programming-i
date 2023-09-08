
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Double> list = new ArrayList<>();
        
        double average = 0;
        double userInput = 0;
        double sum = 0;
        double total = 0;
        
        while(true){
            userInput = Integer.valueOf(scanner.nextLine());
            if( userInput == -1 ){
                break;
            }
            list.add(userInput);
            sum += userInput;
            total++;
        }

        average = sum / total;
        
        System.out.println("Average: " + average);
        
    }
}
