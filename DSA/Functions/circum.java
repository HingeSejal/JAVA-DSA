package DSA.Functions;

import java.util.Scanner;

public class circum {
        public static double circumference(int r) {
        double pi = Math.PI;
        double cf=2*pi*r;
        return cf ;
    }
    public static void main(String args[]){
       Scanner sc =  new Scanner(System.in);
        int r = sc.nextInt();
       System.out.println("Circumference is: " + circumference(r));
    }
}
