
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.equals("")) {
                break;
            } else {

                System.out.println("Last name: ");
                String lastName = scanner.nextLine();

                System.out.println("Identification number: ");
                String identNumber = scanner.nextLine();
                
                infoCollection.add(new PersonalInformation(firstName,
                                                            lastName,
                                                            identNumber));
                
                
            }
        }
        System.out.println("");
        for( PersonalInformation x : infoCollection ){
            System.out.println( x.getFirstName() + " " + x.getLastName());
        }

    }
}
