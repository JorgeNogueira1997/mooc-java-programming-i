
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        // 0 - a
        // 1 - b
        // 2 - c
        // 3 - d
        // list.size() = 4;
        
        /*
        int aux = list.size() - 1;
        while( aux >= 0 ){
            String name = list.get(aux);
            System.out.println(name);
            aux = aux - 1;
            break;
        }
        */
        
        /*
        for( int i = 0; i < list.size() - 1; i++ ){
            String name = list.get(i);
            System.out.println(name);
            break;
        }
        */
        
        for( int i = list.size() -1; i >= 0; i-- ){
            String name = list.get(i);
            System.out.println(name);
            break;
        }

    }
}
