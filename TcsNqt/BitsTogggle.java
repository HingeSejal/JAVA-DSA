package TcsNqt;

import java.util.*;

public class BitsTogggle{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // constraint check
        if (n < 1 || n > 100) {
            System.out.print("Wrong input");
            return;
        }

        // find number of bits in n
        int temp = n;
        int bits = 0;

        while (temp > 0) {
            bits++;
            temp = temp / 2;
        }

        // create mask like 111.. (bits times)
        int mask = (1 << bits) - 1;

        // toggle bits using XOR
        int result = n ^ mask;

        System.out.print(result);
    }
}

