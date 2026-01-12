
//dated: 10/01/2026, 5:00pm
import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {

        // Write your Code Here

        System.out.println("Enter the Value of Radius");
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();

        Double Circumferance = 2 * Math.PI * r;
        Double Area = Math.PI * r * r;

        System.out.println("Area:" + Area);

        System.out.println("Circumferance:" + Circumferance);
    }
}