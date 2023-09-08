
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();
        
        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        // Implement the readRecordsFromFile method such that it 
        // reads the persons from the file passed as a parameter, 
        // and finally returns them in the list returned by the method.

        // the problem was in this line i onyl had "file"....
        try ( Scanner x = new Scanner(Paths.get(file))) {
            //String lixo = x.nextLine();
            while (x.hasNextLine()) {
                String read = x.nextLine();
                String[] array = read.split(",");

                String name = array[0];
                int age = Integer.valueOf(array[1]);
                
                //System.out.println("read: " + read);
                //System.out.println("nome: " + name);
                
                Person newPersonAdded = new Person(name, age);

                persons.add(newPersonAdded);

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}
