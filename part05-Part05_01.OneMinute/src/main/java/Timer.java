/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class Timer {

    // first hand
    // 1 hundredth of a second corresponds to 0.01 seconds
    // when this value ^ reaches 100, reset it to 0
    // and the number of seconds increment 1
    
    // second hand
    // when seconds reach 60, reset it to 0
    private int seconds;
    private int minutes;

    // creates a new timer
    public Timer() {
        this.seconds = 0;
        this.minutes = 0;
    }

    public void advance() {
        this.seconds += 01;

        if (this.seconds == 100) {
            this.seconds = 0;
            this.minutes += 1;
        }

        if (this.minutes == 60) {
            this.minutes = 0;
        }
    }

    public String toString() {
        if (this.minutes < 10) {
            if (this.seconds < 10) {
                return "0" + this.minutes + ":" + "0" + this.seconds;
            } else {
                return "0" + this.minutes + ":" + this.seconds;
            }
        } else {
            if (this.seconds < 10) {
                return this.minutes + ":" + "0" + this.seconds;
            } else {
                return this.minutes + ":" + this.seconds;
            }
        }
    }

}
