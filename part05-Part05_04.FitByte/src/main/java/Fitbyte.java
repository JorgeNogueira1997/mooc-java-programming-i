/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class Fitbyte {
    
    private int age;
    private int restingHeartRate;
    //private double maxHeartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
        
        //this.maxHeartRate = 206.3 - (0.711 * this.age);
    }
    
    // calculates the tartget heart rate
    public double targetHeartRate(double percentageOfMaximum){
        // max heart rate: 200
        // resting heart: 50
        // target heart rate 75%:
        // ((200-50) * (0.75) + 50)
        return (( (206.3 - (0.711 * this.age)) - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate );
    }
    
}
