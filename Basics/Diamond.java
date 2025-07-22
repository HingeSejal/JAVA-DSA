package Basics;

public class Diamond {
    public static void main(String arg[]){
        /*              n=4 , spaces=>(n-i) , stars=>2*i-1
                *        i=1 => spaces=>3   => stars= 1
               ***       i=2 => spaces=>2   => stars= 2*2 - 1
              *****      i=3 => spaces=>1   => stars= 2*3 - 1
             *******     i=4 => spaces=>0   => stars= 2*4 - 1
             *******        
              ***** 
               *** 
                *
        */
         int n=4;
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
         }
         //lower half
         for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
}
