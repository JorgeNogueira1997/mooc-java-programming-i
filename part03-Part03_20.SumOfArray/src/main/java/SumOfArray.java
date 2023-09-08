
public class SumOfArray {

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int sum = 0;
        
        int i = 0;
        while( i < array.length){
            sum += array[i];
            i++;
        }

        // or
        
/*
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
*/
        
        return sum;
    }

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

}
