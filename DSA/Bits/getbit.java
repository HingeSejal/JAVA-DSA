package DSA.Bits;

//get the 3rd bit(position 2) of num n (0101)
// to know if it is 1 or 0
//calculate bit position from right to left

public class getbit {
    public static void main(String args[]){
        int n= 5; //0101
        int pos = 3;
        int bitMask = 1<<pos ; 
        //bit manupulating in java is known as bitMasking

        if((bitMask & n) == 0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
    }
}


/*

2   << 1 -> left shift
010 << 1
100

also,
100 & 010
000 -> means element at third position  can be zero

2   >> 1 -> right shift
010 >> 1
001

*/