
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double gift = Double.valueOf(scan.nextLine());

        // For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08), 
        // and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12).
        double aux = 0;

        if (gift >= 0 && gift < 5000) {
            System.out.println("No tax!");

        } else if (gift >= 5000 && gift <= 25000) { // 100 lower limit - 8 tax rate
            aux = (100 + (gift - 5000) * 0.08);
            System.out.println("Tax: " + aux);
            
        } else if (gift >= 25000 && gift <= 55000) { // 1700 lower limit - 10 tax rate
            aux = (1700 + (gift - 25000) * 0.1);
            System.out.println("Tax: " + aux);

        } else if (gift >= 55000 && gift <= 200000) { // 4700 lower limit - 12 tax rate
            aux = (4700 + (gift - 55000) * 0.12);
            System.out.println("Tax: " + aux);

        } else if (gift >= 200000 && gift <= 1000000) { // 22100 lower limit - 15 tax rate
            aux = (22100 + (gift - 200000) * 0.15);
            System.out.println("Tax: " + aux);

        } else if (gift >= 1000000) { // 142100 lower limit - 17 tax rate
            aux = (142100 + (gift - 1000000) * 0.17);
            System.out.println("Tax: " + aux);
        }

    }
}
