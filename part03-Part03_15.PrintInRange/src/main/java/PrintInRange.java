
import java.util.ArrayList;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

        for (int i = 0; i < numbers.size(); i++) {
            if( numbers.get(i) >= lowerLimit && numbers.get(i) <= upperLimit ){
                System.out.println(numbers.get(i));
            }
        }

    }

    public static void main(String[] args) {
        // Try your method here

        // 3 1 7 9 2 6
        // lower 1
        // upper 2
        // output 1 7
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1); // 2
        numbers.add(7); // 6
        numbers.add(9); // -1
        numbers.add(2); // 5
        numbers.add(6); // 1

        System.out.println("The numbers in the range [1, 2]");
        printNumbersInRange(numbers, 1, 2);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }

}
