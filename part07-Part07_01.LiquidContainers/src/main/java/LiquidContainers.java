
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainerCurrentCapacity = 0;
        int secondContainerCurrentCapacity = 0;

        while (true) {
            System.out.println("First: " + firstContainerCurrentCapacity + "/100");
            System.out.println("Second: " + secondContainerCurrentCapacity + "/100");
            System.out.print("> ");

            String userInput = scan.nextLine();
            String[] split = userInput.split(" "); // will split in blank spaces 

            if (userInput.equals("quit")) {
                break;
            } else {
                String firstWord = split[0];
                String secondWord = split[1];

                if (firstWord.equals("add")) {
                    // this will allways add to the first container
                    if (Integer.valueOf(secondWord) > 0) {
                        if (Integer.valueOf(secondWord) + firstContainerCurrentCapacity >= 100) {
                            firstContainerCurrentCapacity = 100; // the rest goes to waste
                        } else if (Integer.valueOf(secondWord) + firstContainerCurrentCapacity <= 100) {
                            firstContainerCurrentCapacity = firstContainerCurrentCapacity + Integer.valueOf(secondWord);
                        }
                    }
                    // variable reset
                    firstWord = null;
                    secondWord = null;
                } else if (firstWord.equals("move")) {
                    // move from first to second, if > than the first, move all, second max is 100
                    if (firstContainerCurrentCapacity <= 0) {
                        continue;
                    } else {
                        if (secondContainerCurrentCapacity <= 100) {
                            if (Integer.valueOf(secondWord) > 0) {

                                if (Integer.valueOf(secondWord) >= firstContainerCurrentCapacity) {
                                    secondContainerCurrentCapacity += firstContainerCurrentCapacity;
                                    firstContainerCurrentCapacity -= Integer.valueOf(secondWord);
                                    if( firstContainerCurrentCapacity <= 0 ){
                                        firstContainerCurrentCapacity = 0;
                                    }
                                } else {
                                    secondContainerCurrentCapacity += Integer.valueOf(secondWord);
                                    if (secondContainerCurrentCapacity >= 100) {
                                        secondContainerCurrentCapacity = 100;
                                    }
                                    firstContainerCurrentCapacity -= Integer.valueOf(secondWord);
                                    if (firstContainerCurrentCapacity < 0) {
                                        firstContainerCurrentCapacity = 0;
                                    }
                                }

                            }
                        }
                    }
                    // variable reset
                    firstWord = null;
                    secondWord = null;
                } else if (firstWord.equals("remove")) {
                    // removes from second container, remove all if second > actual
                    if (secondContainerCurrentCapacity <= 0) {
                        continue;
                    } else {
                        if (Integer.valueOf(secondWord) >= secondContainerCurrentCapacity) {
                            secondContainerCurrentCapacity = 0;
                        } else {
                            secondContainerCurrentCapacity -= Integer.valueOf(secondWord);
                        }
                    }
                    // variable reset
                    firstWord = null;
                    secondWord = null;
                }
            }
        }
    }
}
