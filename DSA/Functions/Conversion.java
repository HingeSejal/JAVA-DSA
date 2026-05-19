import java.io.* ;
import java.util.*;

public class Conversion{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base1 = sc.nextInt();
		int base2 = sc.nextInt();

		int val = getValue(num , base1 , base2);
		System.out.println(val);

	}

	public static int getValue(int num , int base1 , int base2){
		int dec = anyBasetoDecimal(num , base1);
		int dn =  DecimaltoAnyBase(num , base2);
		return dn ;
	}

	public static int anyBasetoDecimal(int num , int base){
		int rv=0;

		int power = 1; //smallest power is 0 val becomes 1

		while(num!=0){
			int Digit = num%10;
			num = num/10;
			rv+= Digit * power;
			power=power*base;
		}
		
		return rv;
	}

	public static int DecimaltoAnyBase(int num,int base ){
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