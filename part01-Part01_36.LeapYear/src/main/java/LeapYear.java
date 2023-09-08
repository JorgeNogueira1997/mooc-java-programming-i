
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());


        /*
        2011 (not a lap year)
        2011 / 4 = 502,75
        2011 / 100 = 20,11
        2011 / 400 = 5,0275
        -
        2012 (lap year)
        2012 / 4 = 503
        2012 / 100 = 20,12 
        2012 / 400 = 5,03 
        -
        2000 (lap year)
        2000 / 4 = 500
        2000 / 100 = 20
        2000 / 400 = 5
        -
        100 (not a lap year)
        100 / 4 = 25
        100 / 100 = 1
        100 / 400 = 0,25 (!)
         */
        // A year is a leap year if it is divisible by 4. 
        // However, if the year is divisible by 100, 
        // then it is a leap year only when it is also divisible by 400.
        // 2011 (not lap year)
        
        if (year % 4 == 0){ 
            if (year % 100 == 0){ // if the year is divisible by 100
                if (year % 400 == 0){ // it's only an leap year if it is also divisible by 400
                    System.out.println("The year is a leap year.");
                } else {
                    System.out.println("The year is not a leap year.");
                }
            } else {
                System.out.println("The year is a leap year."); // divisible by 4 but not by 100, so a leap year
            }
        } else {
            System.out.println("The year is not a leap year."); // not divisible by 4, definitely not a leap year
        }

    }
}
