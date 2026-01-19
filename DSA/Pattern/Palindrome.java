package DSA.Pattern;

public class Palindrome {
    public static void main(String args[]){
        /*
                    11
                   2112
                  321123
                 43211234
                5432112345
        
        */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i ;j++){
               System.out.print(" ");
             }
             for(int j=i;j>=1 ;j--){ // i times
               System.out.print(j);
             }
             for(int j=1;j<=i ;j++){ // i times
               System.out.print(j);
             }
            System.out.println();
        }

    }
}
