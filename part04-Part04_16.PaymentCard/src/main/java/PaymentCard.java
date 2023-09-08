/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (this.balance >= 0) {
            double aux = this.balance - 2.60;
            if (aux >= 0) {
                this.balance = aux;
            }
        }
    }

    public void eatHeartily() {
        if (this.balance >= 0) {
            double aux = this.balance - 4.60;
            if (aux >= 0) {
                this.balance = aux;
            }
        }
    }

    public void addMoney(double ammount) {
        if( ammount < 0 ){
            return;
        }
        
        if (this.balance < 150) {
            double aux = this.balance + ammount;
            if (aux >= 0 && aux <= 150) {
                this.balance += ammount;
            }else if( aux >= 0 && aux >= 150){
                this.balance = 150;
            }
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

}
