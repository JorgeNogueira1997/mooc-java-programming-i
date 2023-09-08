
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String user = scanner.nextLine();
            
            if( user.isEmpty() ){
                break;
            }else{
                String[] aux = user.split(" ");
                int last = aux.length-1;
                
                System.out.println(aux[last]);
                
                
            }
        }

    }
}
