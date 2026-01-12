
//dated: 11/01/2026, 8:39 pm
import java.util.Scanner;

public class ParityCheck {
    // Even or odd Checker
    public static void main(String[] args) {
        // Write your code Here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number:");

        int Number = sc.nextInt();
        // Condition
        if (Number % 2 == 0) {
            // IF Statement body
            System.out.println("Your number is Even...");
        } else {
            // Else Statement body
            System.out.println("Your number is Odd...");
        }

    }
}
