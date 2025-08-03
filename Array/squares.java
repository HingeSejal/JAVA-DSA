package Array;

import java.util.Scanner;

public class squares {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N=5;
        int[] num= new int[N];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]*num[i]);
        }

    }
}
