
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {

        int aux = 0;
        for (Item x : items) {
            aux = aux + x.getWeight();
        }
        //System.out.println("dentro addItem aux: " + aux);

        // se o total de peso de itens que tem na mala +
        // o novo item ultrapassar o maximo, não adiciona
        if (!( (item.getWeight() + aux) > this.maxWeight)) {
            this.items.add(item);
            
        }
        
        /*
        if (item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
         */
    }

    // Parte 4
    public void printItems() {
        int index = 0;
        while (index < this.items.size()) {
            System.out.println(this.items.get(index));
            index += 1;
        }
    }

    public int totalWeight() {
        if (this.items.isEmpty()) {
            return -1;
        } else {
            int totalWeight = 0;
            for (Item x : items) {
                totalWeight = totalWeight + x.getWeight();
            }
            return totalWeight;
        }
    }

    // parte 5
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        } else {
            //int heaviest = 0;
            Item auxHeaviest = new Item("aux",0);
            for (Item x : this.items) {
                if (x.getWeight() >= auxHeaviest.getWeight()) {
                    auxHeaviest = x;
                }
            }
            return auxHeaviest;
        }
    }

    public String toString() {
        int aux = 0;
        for (Item x : this.items) {
            aux = aux + x.getWeight();
        }

        if (this.items.isEmpty()) {
            return "no items (" + aux + "kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + aux + "kg)";
        } else {
            return this.items.size() + " items (" + aux + "kg)";
        }
    }

}
