package DSA.Basics;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        //Example: 3897 = 3^4 + 8^4 + 9^4 + 7^4 = 3897
        int numDigits = String.valueOf(num).length();
        while(temp>0){
            int lastDigit = temp%10;
            sum += Math.pow(lastDigit, numDigits);
            temp /= 10;
        }

        if(sum == num){
            System.out.println("It's an Armstrong Number");
        }
        else{
            System.out.println("It's not an Armstrong Number");
        }
    }
}

//Armstrong Number: A number that is equal to the sum of its own digits each raised to the power of the number of digits.
//Example: 153 = 1^3 + 5^3 + 3^3 = 153
//Example: 3897 = 3^4 + 8^4 + 9^4 + 7^4 = 3897
