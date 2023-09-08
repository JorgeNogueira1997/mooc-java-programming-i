
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jorge
 */
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcase;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcase = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int aux = 0;
        for (Suitcase x : this.suitcase) {
            aux = aux + x.totalWeight();
        }
        //System.out.println("aux: " + aux);
        //System.out.println("suitcase.totalWeight(): " + suitcase.totalWeight());
        //System.out.println("this.suitcase.size(): " + this.suitcase.size());
        //System.out.println("");
        
        // o aux tem o total de kg de itens que tem la dentro
        // se esse aux + o total de peso da suitcase ultrapassarem o maximo que ele
        // permite não deixa (está negado) ou seja sóo deixa quando for <=
        if ( !( (suitcase.totalWeight() + aux) > this.maxWeight) ) {
            this.suitcase.add(suitcase);
        }
    }

    public void printItems() {

        for(Suitcase x : this.suitcase){
            x.printItems();
        }
        
    }

    public String toString() {

        if (this.suitcase.isEmpty()) {
            return null;
        } else {
            int weightInHold = 0;
            for (Suitcase x : this.suitcase) {
                weightInHold = weightInHold + x.totalWeight();
            }

            if (this.suitcase.size() == 1) {
                return this.suitcase.size() + " suitcase (" + weightInHold + "kg)";
            } else {
                return this.suitcase.size() + " suitcases (" + weightInHold + "kg)";
            }
        }
    }
}
