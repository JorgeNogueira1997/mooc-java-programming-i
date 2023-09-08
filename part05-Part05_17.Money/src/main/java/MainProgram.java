
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        // Part 1:
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
        //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00eƒ

        System.out.println("");
        // Part 2:
        Money aa = new Money(10, 0);
        Money bb = new Money(3, 0);
        Money cc = new Money(5, 0);

        System.out.println(aa.lessThan(bb));  // false
        System.out.println(bb.lessThan(cc));  // true
        
        System.out.println("");
        
        Money firstMoneyObject = new Money(1, 0); 
        Money secondMoneyObject = new Money(1, 50); 
        Money thirdMoneyObject = new Money(-3,5); 
        Money fourthMoneyObject = new Money(2,0);  
        
        System.out.println(thirdMoneyObject.lessThan(firstMoneyObject));
        System.out.println("aqui");
        
        //expected:<true> but was:<false>
        
        
        
        System.out.println("");
        System.out.println("Parte 3");
        // Part 3:
        Money aaa = new Money(10, 0);
        Money bbb = new Money(3, 50);

        Money ccc = aaa.minus(bbb);

        System.out.println(aaa);  // 10.00e
        System.out.println(bbb);  // 3.50e
        System.out.println(ccc);  // 6.50e

        System.out.println("");
        ccc = ccc.minus(aaa);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
        //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(aaa);  // 10.00e
        System.out.println(bbb);  // 3.50e
        System.out.println(ccc);  // 0.00e
        
        
        
        System.out.println("");
        
        Money firstMoneyObjectt = new Money(10, 0); 
        Money secondMoneyObjecy = new Money(2, 0);
        Money tennerMinusTwoEuros = firstMoneyObjectt.minus(secondMoneyObjecy);
        
        System.out.println(tennerMinusTwoEuros.euros());
        //expected:<8> but was:<10>
        System.out.println("aqui");
        
        
        System.out.println("");
        
        
        Money firstMoneyObject2 = new Money(10, 0);
        Money secondMoneyObject2 = new Money(7, 40);
        Money firstMinusSecond2 = firstMoneyObject2.minus(secondMoneyObject2);
        
        System.out.println(firstMinusSecond2.euros());
        //expected:<2> but was:<3>
        System.out.println("aqui2");
    }
}
