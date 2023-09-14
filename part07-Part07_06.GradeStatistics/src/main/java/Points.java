
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jorge
 */
public class Points {

    ArrayList<Integer> userPoints;

    public Points() {
        this.userPoints = new ArrayList<>();
    }

    public void add(int valueBeingAdded) {
        if (valueBeingAdded >= 0 && valueBeingAdded <= 100) {
            this.userPoints.add(valueBeingAdded);
        }
    }

    public double calculateAveragePoints() {
        int sum = 0;

        int index = 0;
        while (index < this.userPoints.size()) {
            sum += this.userPoints.get(index);
            index += 1;
        }

        Double average = (double) sum / this.userPoints.size();
        //System.out.println("Point average (all): " + average);
        return average;
    }

    public double calculatePassingPoints() {
        // >= 50 points
        int sum = 0;
        int counter = 0;

        int index = 0;
        while (index < this.userPoints.size()) {
            if (this.userPoints.get(index) >= 50) {
                sum += this.userPoints.get(index);
                counter++;
            }
            index += 1;
        }
        Double passingPoints = (double) sum / counter;
        //System.out.println("passingPoints: " + passingPoints);

        if (counter == 0) {
            return -1;
        }

        //System.out.println("Point average (passing): " + passingPoints);
        return passingPoints;

    }

    public double calculatePassPercentage() {
        // The pass percentage is calculated using the formula:
        // 100 * passing / participants.

        double passing = 0;
        int index = 0;
        while (index < this.userPoints.size()) {
            if (this.userPoints.get(index) >= 50) {
                passing++;
            }

            index += 1;
        }
        //System.out.println("passing: " + passing);

        int participants = this.userPoints.size();
        //System.out.println("participants: " + participants);

        double passPercentage = (100 * passing) / participants;
        if (passPercentage <= 0) {
            return 0.0;
        }
        return passPercentage;
    }

    public int pointsToGrade(int points) {

        //System.out.println("recebi points: " + points);
        int grade = 0;

        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        //System.out.println("mando grade: " + grade);

        return grade;
    }

    public static void printsStars(int stars) {
        //System.out.println("recebi: " + stars);
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    public void gradeDistribution() {
        int[] gradeCounts = new int[6]; 

        for (int i = 0; i < this.userPoints.size(); i++) {
            int x = pointsToGrade(this.userPoints.get(i));
            gradeCounts[x]++;
        }

        for (int printGrade = 5; printGrade >= 0; printGrade--) {
            System.out.print(printGrade + ": ");
            printsStars(gradeCounts[printGrade]);
            System.out.println();
        }
    }

    @Override
    public String toString() {
        double aux = calculatePassingPoints();
        if (aux == -1) {
            return "Point average (all): " + calculateAveragePoints() + "\n"
                    + "Point average (passing): -" + "\n"
                    + "Pass percentage: " + calculatePassPercentage();
        }
        return "Point average (all): " + calculateAveragePoints() + "\n"
                + "Point average (passing): " + calculatePassingPoints() + "\n"
                + "Pass percentage: " + calculatePassPercentage();
    }

}
