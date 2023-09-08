/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class Archive {

    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override 
    public boolean equals(Object x) {

        if (this == x) {
            return true;
        }

        if (!(x instanceof Archive)) {
            return false;
        }

        Archive aux = (Archive) x;

        if (this.identifier.equals(aux.identifier)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }

}
