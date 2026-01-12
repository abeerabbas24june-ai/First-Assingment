
//dated: 11/01/2026, 7:45 pm
import java.util.Scanner;

public class TrapezoidAreaCalc {
    public static void main(String[] args) {
        // Write your Code Here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Parrallel Side:");
        Double PS1st = sc.nextDouble();

        System.out.println("Enter 2nd Parrallel Side:");
        Double PS2nd = sc.nextDouble();

        System.out.println("Enter the Height:");
        Double height = sc.nextDouble();

        Double trapezoidarea = (height * (PS1st + PS2nd)) / 2;
        System.out.println("K=" + trapezoidarea);

    }
}
