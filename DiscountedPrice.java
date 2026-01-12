
//dated: 10/01/2026, 7:00 pm
import java.util.Scanner;

public class DiscountedPrice {
    public static void main(String[] args) {
        // Write your Code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Selling Price:");
        Double Sp = sc.nextDouble();
        // Sp(selling price)

        System.out.println("Enter Discount Percentage:");
        Double Dp = sc.nextDouble();
        // Dp(Discount Percentage)

        Double discountedPrice = (Sp * Dp) / 100;
        System.out.println("Discounted Price:" + discountedPrice);
    }
}