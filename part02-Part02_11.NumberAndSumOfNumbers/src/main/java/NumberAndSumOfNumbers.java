
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int auxUser = 0;
        int numberNumbers = 0;
        int sumNumbers = 0;
        
        while(true){
            System.out.println("Give a number:");
            auxUser = Integer.valueOf(scanner.nextLine());
            
            if( auxUser == 0 ){
                break;
            }else{
                numberNumbers++;
                sumNumbers = sumNumbers + (auxUser);
            }
            
            
        }
        System.out.println("Number of numbers: "+ numberNumbers);
        System.out.println("Sum of the numbers: "+ sumNumbers);
        
    }
}
