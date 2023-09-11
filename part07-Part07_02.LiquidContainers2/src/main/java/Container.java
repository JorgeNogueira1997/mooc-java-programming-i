/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class Container {

    private int containerAmount;

    public Container() {
        this.containerAmount = 0;
    }

    public int contains() {
        return this.containerAmount;
    }

    public void add(int amount) {
        if (amount > 0) {
            int difference = amount + this.containerAmount;
            if (difference >= 100) {
                this.containerAmount = 100;
            } else {
                this.containerAmount += amount;
            }
        }

    }

    public void remove(int amount) {
        if (amount > 0) {
            int difference = this.containerAmount - amount;
            if (difference <= 0) {
                this.containerAmount = 0;
            } else {
                this.containerAmount -= amount;
            }
        }

    }

    public String toString() {
        return this.containerAmount + "/100";
    }

}
