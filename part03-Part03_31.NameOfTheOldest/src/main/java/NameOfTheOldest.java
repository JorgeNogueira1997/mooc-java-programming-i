
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOldest = null;
        int ageOldest = 0;
        
        while (true) {
            String userInput = scanner.nextLine();
            
            if( userInput.equals("") ){
                break;
            }else{
                String[] array = userInput.split(",");
                
                for(int i = 0; i < array.length; i++){
                    if( Integer.valueOf(array[1]) > ageOldest ){
                        ageOldest = Integer.valueOf(array[1]);
                        nameOldest = String.valueOf(array[0]);
                    }
                }
            }
        }
        System.out.println("Name of the oldest: "+ nameOldest);

    }
}
