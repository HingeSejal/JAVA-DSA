package DSA.Functions;
import java.util.*;
public class avg {
    public static int Average(int a , int b, int c) {
        int avgNo=(a+b+c)/3 ;
        return avgNo ;
    }
    public static void main(String args[]){
       Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       System.out.println("Average of No is: " + Average(a,b,c));
    }
}
