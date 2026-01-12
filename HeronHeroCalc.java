
//dated: 11/01/2026, 9:10 pm
import java.util.Scanner;

public class HeronHeroCalc {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Side: ");
        Double Side1st = sc.nextDouble();

        System.out.println("Enter 2nd Side:");
        Double Side2nd = sc.nextDouble();

        System.out.println("Enter 3rd Side:");
        Double Side3rd = sc.nextDouble();

        Double S = (Side1st + Side2nd + Side3rd) / 2;
        // S(Semi-perimeter)
        Double A = Math.sqrt(S * (S - Side1st) * (S - Side2nd) * (S - Side3rd));
        // A(Area)
        System.out.println("Area:" + A);

    }
}
