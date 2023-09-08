
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        Scanner scanner = new Scanner(System.in);

        TodoList list = new TodoList();
        UserInterface ui = new UserInterface(list, scanner);
        ui.start();

        /*
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        System.out.println();
        list.print();
        */
        
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        
        list.remove(2);
        
        list.print();
        
        
        list.add("buy raisins");
        
        
        list.print();
        
        
        list.remove(1);
        list.remove(1);
        
        list.print();
    }
}
