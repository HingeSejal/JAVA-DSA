import java.io.* ;
import java.util.*;

public class Primeprint{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();

		if(low==1){
			low++;
		}

		for(int i=low;i<=high;i++){
			int count=0;
			for(int j=2;j*j<=i;j++){
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count==0){
				System.out.println(i);
			}
		}
	}
}