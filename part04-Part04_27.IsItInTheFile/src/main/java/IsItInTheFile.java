
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean found = false;
        try( Scanner x = new Scanner(Paths.get(file)) ){
            
            while( x.hasNextLine() ){
                if( x.nextLine().contains(searchedFor) ){
                    //System.out.println("mostra2 : " + x);
                    //System.out.println("Found!");
                    found = true;
                    //System.out.println("found: " + found);
                    break;
                }else{
                    //System.out.println("Not found.");
                    found = false;
                    //System.out.println("found: " + found);
                    //break;
                }
            }

            //System.out.println("found fora : " + found);
            if( found == true ){
                System.out.println("Found!");
            }else{
                System.out.println("Not found.");
            }
            
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        
        
    }
}
