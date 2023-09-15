
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
public class Observation {

    ArrayList<Bird> arrayBirds;

    public Observation() {
        this.arrayBirds = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.arrayBirds.add(bird);
    }

    public boolean isItABird(String name) {
        for (int i = 0; i < this.arrayBirds.size(); i++) {
            Bird aux = this.arrayBirds.get(i);
            if (aux.getBirdName().equals(name)) {
                aux.incrementObservationCount();
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        for (int i = 0; i < this.arrayBirds.size(); i++) {
            Bird aux = this.arrayBirds.get(i);
            System.out.println(aux.getBirdName()
                    + " (" + aux.getBirdNameLatin() + ") "
                    + aux.getObservationCount() + " observations");
        }
    }

    public void printOne(String name) {
        for (int i = 0; i < this.arrayBirds.size(); i++) {
            Bird aux = this.arrayBirds.get(i);
            
            if (aux.getBirdName().equals(name)) {
                System.out.println(aux.getBirdName()
                        + " (" + aux.getBirdNameLatin() + ") "
                        + aux.getObservationCount() + " observations");
            }
        }
    }

}
