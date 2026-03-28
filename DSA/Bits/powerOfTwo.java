package DSA.Bits;

import java.util.Scanner;

public class powerOfTwo {
    public static boolean isPowerOfTwo(int n){
        return (n>0) && (( n & (n-1))) ==0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number?");
        int num = sc.nextInt();

        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is NOT a power of 2.");
        }

        sc.close();

    }

}


/*

Why do we use n & (n - 1)?
A power of 2 has only one 1 bit in its binary form.

Number	Binary(n)   n-1     n & n-1
1	     0001       0000      0
2	     0010       0001      0
4	     0100       0011      0
8   	 1000       0111      0

*/