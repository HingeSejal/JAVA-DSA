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

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                System.out.println("Found at "+ i + " position");
                break;
            }
        }

    }
}
