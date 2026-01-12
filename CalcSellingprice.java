
//dated: 11/01/2026, 7:00 pm
import java.util.Scanner;

public class CalcSellingprice {
    public static void main(String[] args) {

        // Write your Code Here.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Discounted Selling Price:");
        Double Dsp = sc.nextDouble();
        // Dsp(Discounted Selling Price)

        System.out.println("Enter Discount Percentage:");
        Double Dp = sc.nextDouble();
        // Dp(Discount percentage)

        Double Sellingprice = Dsp / (1 - Dp / 100);
        System.out.println("Selling gprice:" + Sellingprice);

    }
}