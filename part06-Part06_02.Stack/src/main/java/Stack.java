/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
import java.util.ArrayList;
public class Stack {
    
    private ArrayList<String> array;
    
    public Stack(){
                this.array = new ArrayList<>();

    }
    
    public boolean isEmpty(){
        if( this.array.isEmpty() ){
            return true;
        }else{
            return false;
        }
    }
    
    public void add(String value){
        this.array.add(value);
    }
    
    public ArrayList<String> values(){
            return this.array;
    }
    
    public String take(){
        int lastOne = this.array.size();
        // se tiver tamanho 6, vai de 0-5 
        String storeLast = this.array.get(lastOne - 1);
        System.out.println("storeLast: " + storeLast);
        
        this.array.remove(lastOne - 1 ); // logo tem que ser -1
        System.out.println("aqui: " + lastOne);
        
        return storeLast;
    }
    
}
