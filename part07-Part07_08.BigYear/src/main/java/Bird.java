
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
public class Bird {

    String birdName;
    String birdNameLatin;
    int birdCounterObservation;

    public Bird(String birdName, String birdNameLatin) {
        this.birdName = birdName;
        this.birdNameLatin = birdNameLatin;
        this.birdCounterObservation = 0;
    }

    public String getBirdName() {
        return this.birdName;
    }

    public String getBirdNameLatin() {
        return this.birdNameLatin;
    }

    public void incrementObservationCount() {
        this.birdCounterObservation++;
    }

    public int getObservationCount(){
        return this.birdCounterObservation;
    }
    
}
