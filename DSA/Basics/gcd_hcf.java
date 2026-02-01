package DSA.Basics;

import java.util.Scanner;

public class gcd_hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd=1;
        for(int i=1;i<=Math.min(num1, num2);i++){
            if(num1%i==0 && num2%i==0){
                gcd=i; // max no divisible by both
            }
        }
        System.out.println("GCD of "+num1+" and "+num2+" is: "+gcd);

        while (num1>0 && num2>0) {
            if(num1>num2){
                num1=num1%num2;
            }else{
                num2=num2%num1;
            }
        }
        if(num1==0){
            System.out.println("GCD is: "+num2);
        }else{
            System.out.println("GCD is: "+num1);
        }
    }
}