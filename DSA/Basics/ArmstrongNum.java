package DSA.Basics;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;

        while(temp>0){
            int lastDigit = temp%10;
            sum += lastDigit*lastDigit*lastDigit;
            temp /= 10;
        }

        if(sum == num){
            System.out.println("It's an Armstrong Number");
        }
        else{
            System.out.println("It's not an Armstrong Number");
        }
    }
}
