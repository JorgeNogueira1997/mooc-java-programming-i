
public class HealthStation {

    //private Person person;
    private int counter = 0;
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        Person aux = person;
        
        //this.person = person;
        this.counter++;
        
        return aux.getWeight();
    }

    public void feed(Person person) {
        Person aux = person;
        //this.person = person;

        aux.setWeight(aux.getWeight() + 1);
    }

    public int weighings(){
        return this.counter;
    }
    
}
