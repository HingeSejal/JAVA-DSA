package Functions;

import java.util.Scanner;

public class greater {
     public static void printgreater(int a, int b){
        if(a>b){
        System.out.println(a+" is greater");
        }
        else{
            System.out.println(b+" is greater");
        }
        return; //return type void
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int a = sc.nextInt();
        int b = sc.nextInt();;
        printgreater(a,b);
    }
}
