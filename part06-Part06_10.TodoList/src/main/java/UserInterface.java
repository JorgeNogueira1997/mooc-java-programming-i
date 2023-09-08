/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String userInput = this.scanner.nextLine();
            
            if( userInput.equals("stop") ){
                break;
            }else if( userInput.equals("add") ){
                System.out.print("To add: ");
                String taskToAdd = this.scanner.nextLine();
                list.add(taskToAdd);
            }else if( userInput.equals("list") ){
                list.print();
            }else if( userInput.equals("remove") ){
                System.out.print("Which one is removed? ");
                int listToRemove = Integer.valueOf(scanner.nextLine());
                list.remove(listToRemove);
            }
        }
    }
}
