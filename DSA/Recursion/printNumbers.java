package DSA.Recursion;

import java.util.Scanner;

public class printNumbers{

public static void printReverseNumber(int n) {
if(n == 0) {
return;
}
System.out.println(n);
printReverseNumber(n-1);
}

public static void printNumber(int n) {
if(n == 0) {
return;
}
System.out.println(n);
printNumber(n+1);
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number :");
    int n = sc.nextInt();

    printReverseNumber(n);
    printNumber(n);

}
}

