
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
/*
        // Part 1
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        //System.out.println("Count: " + statistics.getCount());
*/

/*
        // Part 2
        //System.out.println("Sum: " + statistics.sum());
        //System.out.println("Average: " + statistics.average());
*/
        // Part 3
        System.out.println("Enter numbers:");
        Statistics sumUserInput = new Statistics();
        Statistics sumEven = new Statistics();
        Statistics sumOdd = new Statistics();

        while (true) {
            //userInput.addNumber(Integer.valueOf(scanner.nextLine()));

            int userNumber = Integer.valueOf(scanner.nextLine());
            if (userNumber == -1) {
                break;
            } else {
                sumUserInput.addNumber(userNumber);

                // -1 can't be used in the maths
                if (userNumber % 2 == 0) { // even
                    //sumEven += userNumber;
                    sumEven.addNumber(userNumber);
                } else { // odd
                    //sumOdd += userNumber;
                    sumOdd.addNumber(userNumber);
                }

            }

        }
        System.out.println("Sum: " + sumUserInput.sum());
        System.out.println("Sum of even numbers: " + sumEven.sum());
        System.out.println("Sum of odd numbers: " + sumOdd.sum());

    }
}
