
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        int auxSize = this.elements.size();

        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        String print = "The collection " + this.name + " has " + auxSize + " element:";
        String multiple = "The collection " + this.name + " has " + auxSize + " elements:";

        String aux = "";
        for (String x : elements) {
            //aux = aux + x;
            aux = aux + "\n" + x;
            // aux is updated to "\nfirst"
            // aux is updated to "\nfirst\nsecond"
            // aux is updated to "\nfirst\nsecond\nthird"
            // x goes from 0 - 2

        }

        if (auxSize == 1) {
            return print + aux;

        } else {
            return multiple + aux;
        }

    }

}
