
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

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

        return grade;
    }

    public double averageOfGrades() {

        if (this.grades.isEmpty()) {
            return -1;
        } else {

            double average = 0;
            int sum = 0;
            int aux = 0;
            while (aux < this.grades.size()) {
                //System.out.println(this.grades.get(aux));
                sum = sum + this.grades.get(aux);
                aux += 1;
            }

            average = (double) sum / this.grades.size();
            // 19/4 = 4.75
            //System.out.println("sum: " + sum);
            //System.out.println("this.grades.size(): " + this.grades.size());
            //System.out.println("average: " + average);

            return average;
        }
    }
    
    public double averageOfPoints(){
        
        if( this.examPoints.isEmpty() ){
            return -1;
        }else{
            
            int index = 0;
            int sum = 0;
            double average = 0;
            while( index < this.examPoints.size() ){
                System.out.println(this.examPoints.get(index));
                sum = sum + this.examPoints.get(index);
                index += 1;
            }
            //System.out.println("sum: " + sum);            
            //System.out.println("this.examPoints.size(): " + this.examPoints.size());
            
            average = (double) sum / this.examPoints.size();
            return average;
            
        }
        
    }

}
