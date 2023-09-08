
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int auxUser = 0;
        int sumNumbers = 0;
        
        while(true){
            System.out.println("Give a number:");
            auxUser = Integer.valueOf(scanner.nextLine());
            
            if( auxUser == 0 ){
                break;
            }else{
                sumNumbers = sumNumbers + (auxUser);
            }
            
        }
        System.out.println("Sum of the numbers: "+ sumNumbers);
        
        
    }
}
