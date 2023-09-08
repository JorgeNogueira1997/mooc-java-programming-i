
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int auxUser = 0;
        int counterUser = 0;

        while (true) {
            System.out.println("Give a number:");
            auxUser = Integer.valueOf(scanner.nextLine());

            if (auxUser == 0) {
                break;
            } else if (auxUser < 0) {
                counterUser++;
            }
        }
        System.out.println("Number of negative numbers: "+ counterUser);

    }
}
