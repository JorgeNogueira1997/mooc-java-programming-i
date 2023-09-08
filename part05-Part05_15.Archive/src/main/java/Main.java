
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> array = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if( identifier.isEmpty() ){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if( name.equals("")){
               break; 
            }
            
            Archive x = new Archive(identifier, name);
            
            if( !( array.contains(x) ) ){
                array.add(x);    
            }
            
        }
        
        System.out.println("==Items==");
        int index = 0;
        while(index < array.size()){
            System.out.println(array.get(index));
            index += 1;
        }

    }
}
