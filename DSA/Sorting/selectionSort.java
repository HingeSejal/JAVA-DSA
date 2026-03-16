package DSA.Sorting;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort Algorithm
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp; 
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

/* 
Selection Sort Algorithm

Go through the array and find the smallest element.
Swap it with the first element.
Go through the remaining array and find the smallest element.
Swap it with the second element.
Continue this process until the entire array is sorted.

Time Complexity: O(n^2) in all cases (worst, average, best)
Space Complexity: O(1)

It is an in-place sorting algorithm.

*/