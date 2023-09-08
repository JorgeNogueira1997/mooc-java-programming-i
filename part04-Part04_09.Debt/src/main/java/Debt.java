/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class Debt {

    private double initialBalance = 0;
    private double initialInterestRate = 0;

    
    public Debt(double initialBalance, double initialInterestRate) {
        this.initialBalance = initialBalance;
        this.initialInterestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.initialBalance);
    }

    public void waitOneYear(){
        // grows the debt amount
        double auxDebt = this.initialBalance * this.initialInterestRate;
        initialBalance = auxDebt;
        //System.out.println("auxDebt: " + auxDebt);
    }
    
}
