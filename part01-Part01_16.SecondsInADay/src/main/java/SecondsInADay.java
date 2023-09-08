
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        
        int number = Integer.valueOf(scanner.nextLine());
        
        // 1 minuto - 60 segundos
        // 5 minuto - x segundos
        // x = 5*60 / 1 = 300 segundos (5 minuto = 300 segundos)
        
        // 1h - 60 minutos
        // 5h - x minutos
        // x = 5*60 / 1 = 300 minutos (5 horas = 300 minutos)
        
        // 1 dia = 24h
        // 5 dia = x h
        // x = 5*24h = 120 horas (5 dias = 120 horas)
        
        // 1 dia são 1.440 minutos (24h * 60min)
        // 1 dia são 86.400 (24h * 60min * 60min)
        
        int result = number * 24 * 60 * 60;
        
        System.out.println(result);
        
    }
}
