
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);
         */
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            System.out.print("> ");

            String input = scan.nextLine();
            String[] array = input.split(" ");

            if (input.equals("quit")) {
                break;
            } else {
                String first = array[0];
                String second = array[1];

                if (first.equals("add")) {
                    firstContainer.add(Integer.valueOf(second));

                } else if (first.equals("move")) {
                    if (!(Integer.valueOf(second) > firstContainer.contains())) {
                        if (!(firstContainer.contains() == 0)) {
                            firstContainer.remove(Integer.valueOf(second));
                            secondContainer.add(Integer.valueOf(second));
                        }
                    } else {
                        secondContainer.add(firstContainer.contains());

                        firstContainer.remove(Integer.valueOf(second));
                    }
                } else if (first.equals("remove")) {
                    secondContainer.remove(Integer.valueOf(second));
                }
            }
        }
    }
}
