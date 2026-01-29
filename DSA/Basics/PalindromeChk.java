package DSA.Basics;

import java.util.*;
public class PalindromeChk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while(num!=0){
            int lastDigit = num%10 ;
            reversed = reversed * 10 + lastDigit;
            num = num/10;
        }
        if(original == reversed){
            System.out.println("it's a Palindrome");
        }
        else{
            System.out.println("it's not a Palindrome");
        }
    }
}
