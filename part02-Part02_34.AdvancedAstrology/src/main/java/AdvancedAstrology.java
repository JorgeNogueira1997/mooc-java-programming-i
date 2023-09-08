
public class AdvancedAstrology {

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
        //System.out.println();
    }

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        //System.out.println("size:" + size); // 4
/*
        for (int i = size - 1; i > 0; i--) { // 0 - 3(4)
            //System.out.println("i:" + i); // 3 - 2 - 1
            printSpaces(i);
            for (int j = 0; j < size; j++) {
                //printStars(j);
                System.out.print(j);
            }
            System.out.println();
        }
*/
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i); // Print spaces before stars
            printStars(i); // Print stars
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        // link no site: 
        // https://java-programming.mooc.fi/part-2/4-methods
        // mesmo no fundo da página
        
        printTriangle(5);
        System.out.println("");
        System.out.println("");
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
