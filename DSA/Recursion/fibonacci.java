package DSA.Recursion;

public class fibonacci {
    public static void printfactorial(int a , int b , int n){
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        int c = a+b;
        printfactorial(b,c,n-1);
    }
    public static void main(String args[]){
        printfactorial(0,1,5);
    }
}
