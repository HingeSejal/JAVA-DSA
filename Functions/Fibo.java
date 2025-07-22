package Functions;

import java.util.Scanner;

public class Fibo {


    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println(); // for newline
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        printFibonacci(n);
    }
}
