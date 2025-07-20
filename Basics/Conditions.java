package Basics;

import java.util.Scanner;

public class Conditions {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }

        
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("a is lesser");
        }
        
    }
}
