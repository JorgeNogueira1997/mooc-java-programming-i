
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int auxUser = 0;
        
        while (true) {
            System.out.println("Give a number:");

            auxUser = Integer.valueOf(scanner.nextLine());
            
            if( auxUser < 0 ){
                System.out.println("Unsuitable number");
                continue;
            }else if( auxUser == 0 ){
                break;
            }else{
                auxUser = auxUser * auxUser;
                
                System.out.println(auxUser);
            }
            
            
        }

    }
}
