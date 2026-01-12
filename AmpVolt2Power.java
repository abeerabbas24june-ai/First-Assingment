
//dated: 11/01/2026 , 7:31 pm
import java.util.Scanner;

public class AmpVolt2Power {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Votage⚡:");
        Double Volt = sc.nextDouble();

        System.out.println("Enter Current⚡:");
        Double Amphere = sc.nextDouble();

        Double POWER = Volt * Amphere;
        System.out.println("Power : " + POWER);
    }
}