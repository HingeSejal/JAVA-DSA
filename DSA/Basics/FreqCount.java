import java.io.* ;
import java.util.*;

public class FreqCount{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		int f = getDigitFreq(n,num);
		System.out.println(f);

	}

	public static int getDigitFreq(int n,int num){
		int count=0;

		while(n!=0){
			int lastDigit = n%10;
			if(lastDigit==num){
				count++;
			}
			n = n/10;
		}
		return count;
	}
}