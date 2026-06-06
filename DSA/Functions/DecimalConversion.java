import java.io.* ;
import java.util.*;

public class DecimalConversion{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		int val = getValue(num, base);
		System.out.println(val);

	}

	public static int getValue(int num,int base ){
		int rv=0;

		int power = 1; //smallest power is 0 val becomes 1

		while(num!=0){
			int Digit = num%base;
			num = num/base;

			rv += Digit * power;
			power = power*10;
		}
		
		return rv;
	}
}