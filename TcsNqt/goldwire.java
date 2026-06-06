package TcsNqt;

//u are given array , add the pair adj number until only one element remains
//print least possible sum

/*

[3, 4, 2, 1, 1]

[3,4,2,1,1]	1+1=2	2
[3,4,2,2]	2+2=4	4
[3,4,4]	    3+4=7	7
[7,4]	    7+4=11	11

Total cost:
2 + 4 + 7 + 11 = 24

*/

import java.util.Scanner;

public class goldwire {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
         arr[i]= sc.nextInt();
       }
       int size = n;
       int totalCost =0;
       while(size>1){
            int minSum = arr[0]+arr[1];
            int pos = 0;

            for(int i=0;i<size;i++){
              int sum = arr[i]+arr[i+1];
              if(sum<minSum){
                minSum = sum;
                pos = i;
              }
            }
            totalCost +=minSum;
            arr[pos]=minSum;

            for(int i=pos+1;i<size-1;i++){
                arr[i]= arr[i+1];
            }
             size--;
            }
        System.out.println(totalCost);

    }
}
