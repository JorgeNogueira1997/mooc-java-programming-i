
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
public class Room {

    private ArrayList<Person> list;

    public Room() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        this.list.add(person);
    }

    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.list;
    }

    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        } else {
            Person auxShortest = this.list.get(0);
            for (Person x : this.list) {
                if (auxShortest.getHeight() > x.getHeight()) {
                    auxShortest = x;
                }
            }
            return auxShortest;
        }
    }

    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        } else {
            Person auxShortest = this.list.get(0);
            for (Person x : this.list) {
                if (auxShortest.getHeight() > x.getHeight()) {
                    auxShortest = x;
                }
            }
            this.list.remove(auxShortest);
            return auxShortest;
        }
    }

}
