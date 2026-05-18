import java.io.* ;
import java.util.*;

public class InverseDigit{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  // 4567

		int OPos = 1;
		int inv = 0;

		while(n!=0){
			int ODigit = n % 10 ; //7 at 1st pos

			inv = inv + OPos * (int)Math.pow(10 , ODigit-1); 
			// 0 + 1 * 10^6 = 1000000 --> 1 at 7th pos

			n = n/10; // to get next last digit
			OPos++ ;

		}
		
		
		System.out.println(inv);
		
	}
}