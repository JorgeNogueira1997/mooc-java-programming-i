
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

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
        
        String first = "";
        String last = "";
        
        for( int i = 0; i < list.size(); i++ ){
            //System.out.println(list.get(i));
            
            if( i == 0 ){
                first = list.get(i);
            }else if( i == list.size()-1 ){
                last = list.get(i);
            }
        }

        System.out.println(first);
        System.out.println(last);
        
    }
}
