
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points userPoints = new Points();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        UserInterface ui = new UserInterface(scanner, userPoints);
        ui.start();
        
        
        System.out.println(userPoints);
        userPoints.gradeDistribution();
    }
}

/*
-42
24
42
72
80
52
-1

102
-4
33
77
99
1
-1
*/