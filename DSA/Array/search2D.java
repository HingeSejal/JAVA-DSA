package DSA.Array;

import java.util.Scanner;

public class search2D {
    public static void main(String args[]){
        // Implement 2D array searching element logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element to search:"); 
        int x=sc.nextInt();

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(numbers[i][j]==x){
                    System.out.println(x+ " is found at position : " + i+ "," +j);
                    return;
                }
             }
         }
    }
}