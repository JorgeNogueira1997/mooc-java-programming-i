
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int converted = 0;
        while(true){
            String user = scanner.nextLine();
            
            if( user.equals("end") ){
                break;
            }else{
                converted = Integer.valueOf(user);
                //System.out.println("mostra: "+ converted);
                converted = converted * converted * converted;
                System.out.println(converted);
            }
            
        }
        //System.out.println("aqui: " + converted);
        //System.out.println(converted);
        
    }
}
