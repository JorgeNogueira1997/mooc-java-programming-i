import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestPerson = 0;
        while (true) {
            String user = scanner.nextLine();

            if (user.equals("")) {
                break;
            } else {
                String[] aux = user.split(",");
                for (int i = 0; i < aux.length; i++) {
                    if (Integer.valueOf(aux[1]) > oldestPerson) {
                        oldestPerson = Integer.valueOf(aux[1]);
                    }
                }
            }
        }
        System.out.println("Age of the oldest: " + oldestPerson);
    }
}
