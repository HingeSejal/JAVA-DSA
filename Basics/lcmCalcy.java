package Basics;
import java.util.*;

public class lcmCalcy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int gcd = 1;
        for (int i = 1; i <= A && i <= B; i++) {
            if (A % i == 0 && B % i == 0) {
                gcd = i;
            }
        }

        int lcm = (A * B) / gcd;
        System.out.println(lcm);

        
    }
}