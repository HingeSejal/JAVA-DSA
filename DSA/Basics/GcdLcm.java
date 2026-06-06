import java.io.* ;
import java.util.*;

public class GcdLcm{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int Oa = a;
		int Ob = b;

		while(a%b != 0){
			int rem = a%b;
			a=b;
			b=rem;
		}
		
		int gcd = b;
		int lcm = (Oa*Ob)/gcd;

		System.out.println(gcd);
		System.out.println(lcm);
	}
}