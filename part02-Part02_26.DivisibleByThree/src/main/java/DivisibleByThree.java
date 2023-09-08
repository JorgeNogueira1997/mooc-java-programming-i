
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(2, 10);
    }

    // that prints all the numbers divisible by three in the given range. 
    // The numbers are to be printed in order from the smallest to the greatest.
    public static void divisibleByThreeInRange(int beginning, int end) {

        for (int i = beginning; i <= end; i++) {
            if ( i % 3 == 0 ) { // rest of the division by 3 is == 0, means it's divisible by 3
                System.out.println(i);
            }
        }

    }

}
