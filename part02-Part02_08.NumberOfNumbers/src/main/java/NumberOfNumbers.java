
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int auxUser = 0;
        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            auxUser = Integer.valueOf(scanner.nextLine());

            if (auxUser != 0) {
                counter++;
                continue;
            } else if (auxUser == 0) {
                break;
            }
        }
        System.out.println("Number of numbers: " + counter);
    }
}
