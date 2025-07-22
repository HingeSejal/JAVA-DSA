package Functions;
import java.util.Scanner;

public class PowerCalculator {

    // Function to calculate x^n
    public static double power(int x, int n) {
        return Math.pow(x, n);  // using built-in method
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        double result = power(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }
}
