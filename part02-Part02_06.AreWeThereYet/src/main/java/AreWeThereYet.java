
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = 0;
        
        while (true) {
            System.out.println("Give a number:");
            userInput = Integer.valueOf(scanner.nextLine());
            
            if( userInput == 4 ){
                break;
            }
            
        }

    }
}
