import java.io.* ;
import java.util.*;

public class DigitReverse{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //3465
		
		int reversedigit = 0 ;

		while(n!=0){
			int lastDigit = n % 10 ;
			n = n / 10 ;

			System.out.print(lastDigit);
		}

		
	}
}