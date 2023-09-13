
import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        // write your code here

        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here

        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= smallest) {
                smallest = array[i];
                index = i;
            }
        }

        //System.out.println("index: " + index);
        return index;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here

        // indices:           0  1  2  3   4
        // int[] numbers3 = {-1, 6, 9, 8, 12};
        //System.out.println("startIndex: " + startIndex); // 0, 1, 2
        int smallest = table[startIndex]; // instead of ... = table[0]
        if (table[0] <= 0) {
            smallest = Integer.MAX_VALUE;
        }
        int index = 0;
        for (int i = startIndex; i < table.length; i++) {
            //System.out.println("i: " + i);
            if (table[i] <= smallest) {
                smallest = table[i];
                index = i;
                //System.out.println("dentro index: " + index);
            }
        }
        //System.out.println("smallest: " + smallest);
        //System.out.println("index: " + index);
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here

        int storeIndex1 = array[0];
        int storeValue1 = array[0];

        int storeIndex2 = array[0];
        int storeValue2 = array[0];

        for (int i = 0; i < array.length; i++) {
            if (i == index1) {
                storeIndex1 = i;
                storeValue1 = array[i];
            } else if (i == index2) {
                storeIndex2 = i;
                storeValue2 = array[i];
            }
        }

        //System.out.println("storeIndex1: " + storeIndex1 + " storeValue1: " + storeValue1);
        //System.out.println("storeIndex2: " + storeIndex2 + " storeValue2: " + storeValue2);
        for (int i = 0; i < array.length; i++) {
            if (i == storeIndex1) {
                array[i] = storeValue2;
            } else if (i == storeIndex2) {
                array[i] = storeValue1;
            }
        }

        //System.out.println("storeIndex1: " + storeIndex1 + " storeValue1: " + storeValue1);
        //System.out.println("storeIndex2: " + storeIndex2 + " storeValue2: " + storeValue2);
    }

    public static void sort(int[] array) {
        // System.out.println(Arrays.toString(array));
        /*
        int auxSorter = 0;
        int smallestNumber = smallest(array);
        int indexSmallestNumber = indexOfSmallest(array);

        int indexSmallestFrom = indexOfSmallestFrom(array, auxSorter);

        System.out.println("smallestNumber: " + smallestNumber);
        System.out.println("indexSmallestnumber: " + indexSmallestNumber);
        System.out.println("indexSmallestFrom: " + indexSmallestFrom);

        // primeira iteração:
        // array, 4, 0 -> troca o que está na posição 4 pelo que está na posição 0
        // incrementar o auxSorter para ir para 1
        // voltar a obter o smallestNumber e o indexSmallestNumber
        
        swap(array, indexSmallestNumber, auxSorter);
        System.out.println(Arrays.toString(array));
         */

        /*
        Examine the array starting from index 0. 
        Swap the following two numbers with each other: 
        the number at index 0, and the smallest number in the array starting from index 0.
        
        Examine the array starting from index 1.
        Swap the following two numbers with each other:
        the number at index 1, and the smallest number in the array starting from index 1.
         */
        System.out.println("aqui");
        for (int i = 0; i < array.length; i++) {
            int indexSmallestFrom = indexOfSmallestFrom(array, i);
            swap(array, i, indexSmallestFrom);
            System.out.println(Arrays.toString(array));
        }

    }

    public static void main(String[] args) {
        // write your test code here

        // Part 01:
        int[] array = {3, 1, 5, 99, 3, 12};
        int x = smallest(array);

        int[] numbers = {6, 5, 8, 7, 11};
        int y = smallest(numbers);

        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Smallest: " + MainProgram.smallest(numbers));

        System.out.println("");
        // Part 02:
        //int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

        System.out.println("");
        // Part 03:
        // indices:       0  1  2  3   4
        int[] numbers3 = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 2));

        System.out.println("");
        // Part 04:
        int[] numbers4 = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(numbers4));

        MainProgram.swap(numbers4, 1, 0);
        System.out.println(Arrays.toString(numbers4));

        MainProgram.swap(numbers4, 0, 3);
        System.out.println(Arrays.toString(numbers4));

        System.out.println("");
        System.out.println("");
        // Part 05:
        int[] numbers5 = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers5));
        MainProgram.sort(numbers5);
        
        System.out.println("");
        System.out.println("");
        int[] numbers55 = {4,7,1};
        System.out.println(Arrays.toString(numbers55));
        MainProgram.sort(numbers55);

    }

}
