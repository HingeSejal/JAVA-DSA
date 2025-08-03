package Array;
import java.util.Scanner;
public class search {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter numbers:");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter key u want to search:");
        int key = sc.nextInt();
        int ans=-1;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                ans= key;
                System.out.println(ans+ "Found at "+ i + " position");
                break;
            }
            else{
                System.out.println(ans);;
            }
        }

    }
}
