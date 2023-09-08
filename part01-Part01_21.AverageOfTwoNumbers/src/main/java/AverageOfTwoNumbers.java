
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        double firstNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        double secondNumber = Integer.valueOf(scanner.nextLine());
        
        double result = (firstNumber + secondNumber) / 2;
        
        System.out.println("The average is "+ result);
        
    }
}
