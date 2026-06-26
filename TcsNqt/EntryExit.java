package TcsNqt;

import java.util.*;

/*
5              ---> Value of T 
[7,0,5,1,3]    ---> Entry[]
[1,2,1,3,4]    ---> Exit[]
8              ---> max number of guests in cruise at end
*/
public class EntryExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] entry = new int[n];
        int[] exit = new int[n];
        for(int i=0;i<n;i++){
            entry[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            exit[i] = sc.nextInt();
        }
        int sum=0;
        int maxSum = sum;
        for(int i=0;i<n;i++){
            sum = sum + entry[i] - exit[i];
            if(maxSum <sum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
