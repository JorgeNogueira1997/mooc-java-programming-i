
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            } else {
                System.out.print("Pages: ");
                int pages = Integer.valueOf(scanner.nextLine());

                System.out.print("Publication year: ");
                int year = Integer.valueOf(scanner.nextLine());

                list.add(new Book(title, pages, year));
            }
        }
        System.out.println("");
        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();
        // answer - awsner (meu)
        
        for(Book x : list){
            if(answer.equals("everything")){
                System.out.println(x);
            }else if(answer.equals("name")){
                System.out.println(x.getName());
            }else if(answer.isEmpty()){
                break;
            }
        }
        
    }
}
