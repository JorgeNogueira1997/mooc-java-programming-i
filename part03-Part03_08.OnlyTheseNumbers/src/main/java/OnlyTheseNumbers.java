
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        // 3 2 1 4 7 = 1 2 3 4 7
        // 0 - 1 -> 1
        
        System.out.print("From where? ");
        int start = Integer.valueOf(scanner.nextLine());
        
        System.out.print("To where? ");
        int end = Integer.valueOf(scanner.nextLine());
        
        
        for( int i = start; i <= end; i++ ){
            System.out.println(numbers.get(i));
            //System.out.println("i: "+ i);
        }
        
    }
}
