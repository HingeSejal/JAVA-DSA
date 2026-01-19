package DSA.Functions;
import java.util.*;
public class Factorial {
    public static void printFactorial(int n){
        int Factorial = 1;

        for(int i=n;i>=1;i--){
            Factorial = Factorial*i ;
        }
        System.out.println(Factorial);
        return; //return type void
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n = sc.nextInt();
        printFactorial(n);
    }
}
