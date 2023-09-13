
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        System.out.println("books.size(): " + books.size());
        // array de tamanho 15 vai de 0-14
        for (int i = 0; i < books.size(); i++) {
            //System.out.println("books.get(i):" + books.get(i));
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        
        
        int begin = 0;
        int end = books.size() - 1;
        
        while(begin <= end){
            int middle = (begin + end) / 2;
            
            if( books.get(middle).getId() == searchedId ){
                return middle;
            }else if( books.get(middle).getId() < searchedId ){
                begin = middle + 1;
            }else if( books.get(middle).getId() > searchedId ){
                end = middle - 1;
            }
            
        }
        
        
        
        /*
        int begin = books.get(0).getId();
        System.out.println("begin: " + begin);

        int end = books.size() - 1;
        System.out.println("end: " + end);

        for (int i = 0; i < books.size(); i++) {
            //System.out.println("books.get(i):" + books.get(i));
            int middle = (begin + end) / 2;
            System.out.println("middle: " + middle);
            if (i == middle) {
                if (books.get(i).getId() == searchedId) {
                    System.out.println("encontrei");
                    return i;
                } else if (books.get(i).getId() > searchedId) { // se for >, apaga para a frente
                    System.out.println("entrou no '>' novo begin: " + begin);
                    System.out.println("entrou no '>' novo end: " + end);
                    end = i - 1; // ou middle - 1                    

                    System.out.println("i: " + i);
                    System.out.println("books.get(i).getId(): " + books.get(i).getId());
                    System.out.println("searchedId: " + searchedId);
                    
                    if (books.get(i).getId() == searchedId) {
                        System.out.println("encontrei");
                        return i;
                    }

                } else { // se for <, apaga para trás
                    // atualiza o begin e o middle
                    begin = i + 1; // ou middle + 1
                    System.out.println("entrou no '<' novo begin: " + begin);
                    System.out.println("entrou no '<' novo end: " + end);

                    System.out.println("i: " + i);
                    System.out.println("books.get(i).getId(): " + books.get(i).getId());
                    System.out.println("searchedId: " + searchedId);
                    
                    if (books.get(i).getId() == searchedId) {
                        System.out.println("encontrei");
                        return i;
                    }

                }
            }
        }
*/


        return -1;
    }
}
