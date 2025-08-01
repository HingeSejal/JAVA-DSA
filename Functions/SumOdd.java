package Functions;

import java.util.Scanner;

public class SumOdd {
    public static int Sumoddno(int[] arr) {
        int SumOdds = 0;
        for (int num : arr) {
            if (num % 2 != 0) {  
                SumOdds += num;
            }
        }
        return SumOdds;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Sumoddno(arr);
        System.out.println("Sum of odd numbers: " + result);
    }
}
