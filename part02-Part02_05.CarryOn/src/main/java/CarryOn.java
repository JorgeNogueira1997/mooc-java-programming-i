
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String aux;
        
        while (true) {
            System.out.println("Shall we carry on?");
            aux = scanner.nextLine();
            if( aux.equals("no")){
                break;
            }
            //System.out.println(aux);
        }
        //System.out.println("no");

    }
}
