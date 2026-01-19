package DSA.Functions;

import java.util.Scanner;

public class category {
    public static void categoryfun(int[] arr) {
        for(int num: arr){
        if(num>0){
            System.out.println(num+ " :positive");
        }
        else if( num<0){
            System.out.println(num+ " :negative");
        }
        else{
            System.out.println(num+ " :zero");
        }
        }
    }
    public static void main(String args[]){
       Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        categoryfun(arr);
        // System.out.println(categoryfun(arr));
    }
}
