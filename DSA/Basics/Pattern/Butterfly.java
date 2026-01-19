package DSA.Basics.Pattern;
public class Butterfly {
public static void main(String args[]){
    /*
            *        *
            **      **
            ***    ***
            ****  ****
            **********
            **********
            ****  ****
            ***    ***
            **      **
            *        *
    
    */
        int  n=5;
        //first half-upper half
        for(int i=1;i<=n;i++){

        //1st part
        for(int j=1;j<=i;j++){
            System.out.print("*");
        } 

        //spaces
        int spaces= 2*(n-i); 
        //aas the spaces are in the even  decreasing manner
        for(int j=1;j<=spaces;j++){
        System.out.print(" ");
        }
 
        //2nd Part
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
    }          

    //lower half
     for(int i=n;i>=1;i--){

        //1st part
        for(int j=1;j<=i;j++){
            System.out.print("*");
        } 

        //spaces
        int spaces= 2*(n-i); 
        //aas the spaces are in the even  decreasing manner
        for(int j=1;j<=spaces;j++){
        System.out.print(" ");
        }
 
        //2nd Part
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
    }          
} 
}
