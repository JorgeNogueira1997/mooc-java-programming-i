
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestNameLength = 0;
        double average = 0;
        int sum = 0;
        int total = 0;
        String storeNameOfLongest = null;
        
        while(true){
            String userInput = scanner.nextLine();
                    
            if( userInput.equals("") ){ // userInput.isEmpty()
                break;
            }else{
                String[] array = userInput.split(",");
                
                for( int i = 0; i < array.length; i++ ){
                    sum += Integer.valueOf(array[1]);
                    total++;
                    
                    int aux = array[0].length();
                    //System.out.println("aux:["+ aux +"] > longestNameLength: [" + longestNameLength +"]");
                    if( aux > longestNameLength ){
                        //System.out.println("sdasd");
                        longestNameLength = aux;
                        storeNameOfLongest = String.valueOf(array[0]);
                    }
                }
            }
            
        }
        average = (double) sum / total;
        
        //System.out.println("Longest name number: " + longestNameLength);
        System.out.println("Longest name: "+ storeNameOfLongest);
        System.out.println("Average of the birth years: "+ average);
        
    }
}