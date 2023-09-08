
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int user = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
        
        for( int i = 1; i <= user; i++ ){
            factorial *= i;
        }
        
        System.out.println("Factorial: " + factorial);
        
    }
}
