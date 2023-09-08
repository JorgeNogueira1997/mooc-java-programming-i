
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    // Part 1:
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }

    // Part 2:
    public boolean lessThan(Money compared) {

        if (this.euros == compared.euros) {
            if (this.cents <= compared.cents) {
                return true;
            } else {
                return false;
            }
        } else if (this.euros < compared.euros) {
            return true;
            /*
            System.out.println("[1]");
            if (this.cents <= compared.cents) {
                return true;
            } else {
                System.out.println("[2]");
                return false;
            }
             */
        }
        return false;

    }

    public Money minus(Money decreaser) {
        // convert euros to cents
        // 1 euro = 100 cents (1*100)
        // 4 euro = 400 cents (4*100)
        // 10 euro - 1.000 cents (10*100)

        Money aux = new Money(this.euros, this.cents);

        int auxEuroInCentsThis = aux.euros * 100;
        int auxCentsThis = aux.cents;
        int storeBothThis = 0;
        // merge the two of them
        storeBothThis = auxEuroInCentsThis + auxCentsThis;

        int auxEuroInCentsDecreaser = decreaser.euros * 100;
        int auxCentsDecreaser = decreaser.cents;
        int storeBothDecreaser = 0;
        // merge the two of them
        storeBothDecreaser = auxEuroInCentsDecreaser + auxCentsDecreaser;

        System.out.println("this.euros: " + this.euros);
        System.out.println("this.cents: " + this.cents);
        System.out.println("auxEuroInCents: " + auxEuroInCentsThis);
        System.out.println("auxCentsThis: " + auxCentsThis);
        System.out.println("auxEuroInCentsDecreaser: " + auxEuroInCentsDecreaser);
        System.out.println("auxCentsDecreaser: " + auxCentsDecreaser);

        double auxMinus = storeBothThis - storeBothDecreaser;
        System.out.println("auxMinus:" + auxMinus);

        // convert back to euro and cents
        auxMinus = auxMinus / 100;
        System.out.println("auxMinus Converted: " + auxMinus);

        // value is (2.6) how to split the value???
        // split value
        int intValue = (int) auxMinus; // This will give you the integer part (2)
        double decimalValue = (auxMinus - intValue) * 100; // This will give you the decimal part (0.6)

        System.out.println("intValue: " + intValue);
        System.out.println("decimalValue: " + decimalValue);
        System.out.println("(int)deciamlValue: " + (int)decimalValue);
        
        if( intValue < 0 || decimalValue < 0){
            intValue = 0;
            decimalValue = 0;
        }
        
        Money returnNew = new Money(intValue, (int)decimalValue);
        
        //returnNew.euros = (this.euros)  - auxEuros;
        //returnNew.cents = (this.cents) - auxCents;
        return returnNew;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
