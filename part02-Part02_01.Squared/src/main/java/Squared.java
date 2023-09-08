
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int user = Integer.valueOf(scanner.nextLine());
        
        user = user * user;
        
        System.out.println(user);
        
    }
}
