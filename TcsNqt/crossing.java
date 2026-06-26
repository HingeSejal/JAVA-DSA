package TcsNqt;
import java.util.Scanner;

public class crossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        long countZero = 0;
        long crossings = 0;

        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                countZero++;
            } else if (x == 1) {
                crossings += countZero;
            }
        }

        System.out.print(crossings);
        sc.close();
    }

}
