
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String teamUser = scan.nextLine();

        int teamCounterGames = 0;
        int numberWins = 0;
        int numberLosses = 0;
        try ( Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (scanner.hasNextLine()) {
                String readData = scanner.nextLine();
                String[] storeData = readData.split(",");

                String teamName1 = storeData[0];
                String teamName2 = storeData[1];
                int pointsTeam1 = Integer.valueOf(storeData[2]);
                int pointsTeam2 = Integer.valueOf(storeData[3]);

                if (teamUser.equals(teamName1)) {
                    teamCounterGames++;

                    if (pointsTeam1 > pointsTeam2) {
                        numberWins++;
                    } else {
                        numberLosses++;
                    }

                }

                if (teamUser.equals(teamName2)) {
                    teamCounterGames++;

                    if (pointsTeam2 > pointsTeam1) {
                        numberWins++;
                    } else {
                        numberLosses++;
                    }

                }

            }

            System.out.println("Games: " + teamCounterGames);
            System.out.println("Wins: " + numberWins);
            System.out.println("Losses: " + numberLosses);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
