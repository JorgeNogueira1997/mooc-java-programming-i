
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        boolean found = false;
        int storeIndex = 0;

        // Implement the search functionality here
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searching) {
                //System.out.println(searching + " is at index " + i + ".");
                found = true;

                //System.out.println("storeIndex: " + storeIndex);
                //System.out.println("i: "+ i);
                storeIndex = i;
                //System.out.println("array[i]: "+ array[i]);
                //System.out.println("found: " + found);
                //System.out.println("storeIndex: "+ storeIndex);
                break;
            } else {
                //System.out.println("searching: "+ searching);
                //System.out.println("index: " + i);
                //System.out.println(searching + " was not found.");
                found = false;
            }
        }

        if (found) {
            System.out.println(searching + " is at index " + storeIndex + ".");
        } else {
            //System.out.println("searching: " + searching);
            //System.out.println("storeIndex: " + storeIndex);
            System.out.println(searching + " was not found.");
        }

    }

}
