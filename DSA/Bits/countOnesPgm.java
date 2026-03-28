package DSA.Bits;

import java.util.Scanner;

//Write a program to count the number of 1’s in a binary representation of the number

public class countOnesPgm{

    public static int countOnes(int n) {
        int count=0;
        while(n>0){
            count+= (n&1);  //check last bit
            n= n>>1 ;       //right shift
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Input decimal number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Count 1s
        System.out.println("Number of 1's in binary: " + countOnes(num));
    }

}