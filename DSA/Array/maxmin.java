package DSA.Array;
import java.util.Scanner ;
public class maxmin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size= sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter nos:");     
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for(int i=0;i<=size;i++){
            numbers[i]= sc.nextInt();
            maxValue=Math.max(maxValue,numbers[i]);
            minValue =Math.min(minValue,numbers[i]);
        }
        System.out.println("Largest Value:"+maxValue);
        System.out.println("Smallest Value:"+minValue);
    }
}
