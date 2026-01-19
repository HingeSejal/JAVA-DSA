package DSA.Array;

import java.util.Scanner;

public class CommonEle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter " + n1 + " elements of first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter " + n2 + " elements of second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] common = new int[Math.max(arr1.length , arr2.length )];
        int k=0;

        System.out.print("Common elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    common[k] =arr1[i];
                    k++;
                    break; // prevent duplicates if arr2 has same number multiple times
                }
            }
        }

        System.out.println("Common Array:");
        for (int i = 0; i < k; i++) {
            System.out.print(common[i] + " ");
        }
    }
}


