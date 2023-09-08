
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        
        try(Scanner x = new Scanner(Paths.get(fileName))){
            
            while(x.hasNextLine()){
                String aux = x.nextLine();
                System.out.println(aux);
            }
            
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
