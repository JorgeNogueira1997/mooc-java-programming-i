
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        
        int result = firstNumber + secondNumber;
        System.out.println(firstNumber +" + "+ secondNumber +" = "+ result);
        
        result = firstNumber - secondNumber;
        System.out.println(firstNumber +" - "+ secondNumber +" = "+ result);
        
        result = firstNumber * secondNumber;
        System.out.println(firstNumber +" * "+ secondNumber +" = "+ result);
        
        double result2 = 1.0 * firstNumber / secondNumber;
        System.out.println(firstNumber +" / "+ secondNumber +" = "+ result2);
        
    }
}
