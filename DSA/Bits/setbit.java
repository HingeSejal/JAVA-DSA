package DSA.Bits;

//set the 2nd bit(position 2) of num n (0101)=5
// to replace the bit by 1 
//calculate bit position from right to left

public class setbit {
    public static void main(String args[]){
        int n= 5; //0101
        int pos = 2;
        int bitMask = 1<<pos ; 

        int newNumber = bitMask | n;
        System.out.println(newNumber);
        
    }
}

