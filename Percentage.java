
//dated: 10/01/2026, 4:00pm
import java.util.Scanner;

public class Percentage {
  public static void main(String[] args) {
    // Write your Code Here.
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Obtain MArks:");
    Double Om = sc.nextDouble();

    System.out.println("Enter Max Marks:");
    Double Mm = sc.nextDouble();

    Double percentage = (Om / Mm) * 100;
    System.out.println("Percentage:" + percentage + "%");
  }
}