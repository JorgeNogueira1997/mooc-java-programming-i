
public class Printer {

    public static void printArrayInStars(int[] array) {
        // Write some code in here

        int i = 0;
        int aux = 0;
        while( i < array.length ){
            
            aux = array[i];
            for( int x = 0; x < aux; x++ ){
                System.out.print("*");
            }
            System.out.println("");
            i++;
        }
        
    }

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

}
