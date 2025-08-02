package Basics;

import java.util.Scanner;

public class largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range:");
        int n= sc.nextInt();
        System.out.println("Enter nos:");     
        int maxValue = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            int current = sc.nextInt();
            maxValue = Math.max(maxValue,current);
        }
        System.out.println("Largest Value:"+maxValue);
    }
}
