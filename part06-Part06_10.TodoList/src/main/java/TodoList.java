// Version 1 of the code got 1/2 points of the question
// but got the error: 
// FAIL: TodoListTest theClassTodoListHasOnlyOneObjectVariable
// the class TodoList only needs one object variable, remove unnecessary variables

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */

/*
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> array;
    private int index;
    private int counterForPrint;

    public TodoList() {
        this.array = new ArrayList<>();
        this.index = 1;
        this.counterForPrint = 1;
        array.add(0, null); // dummy
    }

    public void add(String task) {
        //System.out.println("aaa");
        //System.out.println("index: " + this.index);
        //System.out.println("array.size(): " + this.array.size());
        //System.out.println("this.array.size(): " + this.array.size());
        array.add(this.index, task);
        //System.out.println("array.size() depois: " + this.array.size());
        //System.out.println("bbb");
        
        //System.out.println("index: " + this.index);
        
        //array.add(task);
        this.index += 1;
    }

    public void print() {
        this.counterForPrint = 1; // reset the variable

        int auxIndex = 1;
        while (auxIndex < this.array.size()) {
            System.out.println(this.counterForPrint + ": " + this.array.get(auxIndex));
            auxIndex += 1;
            this.counterForPrint += 1;
        }

    }

    public void remove(int number) {
        this.counterForPrint = 1; // reset the variable

        for (int i = 0; i < this.array.size(); i++) {
            //System.out.println("i:" + i);
            if (i == number) {
                //System.out.println("apaga este!: " + i);
                this.array.remove(i);
                this.index -= 1;
            }

        }

    }

}
*/

// Version 2 with only 1 object variable
import java.util.ArrayList;
public class TodoList {

    private ArrayList<String> array;

    public TodoList() {
        this.array = new ArrayList<>();
        array.add(0, null); // dummy
    }

    public void add(String task) {
        array.add(task);
    }

    public void print() {
        int auxIndex = 1;
        while (auxIndex < this.array.size()) {
            System.out.println(auxIndex + ": " + this.array.get(auxIndex));
            auxIndex += 1;
        }
    }

    public void remove(int number) {
        for (int i = 0; i < this.array.size(); i++) {
            if (i == number) {
                this.array.remove(i);
            }
        }
    }

}

