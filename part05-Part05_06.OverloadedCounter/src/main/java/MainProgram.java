
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter x = new Counter();
        Counter y = new Counter(5);
        
        x.increase();
        x.increase();
        x.increase();
        x.decrease();
        // x = 2
        
        y.decrease(5); 
        y.increase(9);
        // y = 9
        
        System.out.println(x);
        System.out.println(y);
    }
}
