package DSA.Array;

import java.util.Scanner;

public class first {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of numbers:");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        System.out.println("Enter " + size + " numbers:");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        //output
        System.out.println("Numbers are:");
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]); //give default 0 if have not store the values
        }
    }
}
