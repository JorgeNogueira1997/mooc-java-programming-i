
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String user = scanner.nextLine();
            
            if( user.isEmpty() ){
                break;
            }else{
                String[] aux = user.split(" ");

                int i = 0;
                while( i < aux.length ){
                    if( aux[i].contains("av") ){
                        System.out.println(aux[i]);
                    }
                    i++;
                }
                
            }
            
        }
        
    }
}
