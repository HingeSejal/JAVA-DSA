package DSA.Basics;

public class PrintDivisor {
    public static void main(String[] args) {
        int num = 12;
        System.out.println("Divisors of " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    
    for(int i = 1; i <=Math.sqrt(36); i++) {
        if(36 % i == 0) {
            System.out.print(i + " ");
            if(i != 36/i) {
                System.out.print((36/i) + " ");
            }
        }
    }
}