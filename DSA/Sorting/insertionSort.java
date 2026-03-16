package DSA.Sorting;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:"); 
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; //because we need to move the current element to the next position
                j--; // shift the elements to the right
            }
            arr[j + 1] = key;
            
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

/*
Insertion Sort Algorithm

one part - sorted values
other part - not sorted 

Take the first value from the unsorted part of the array.
Move the value into the correct place in the sorted part of the array.
Go through the unsorted part of the array again as many times as there are values.

Time Complexity: O(n^2) in worst and average case (when the array is sorted in reverse order)
                 O(n) in the best case (when the array is already sorted).

Space Complexity: O(1)

it is an in-place sorting algorithm.

*/