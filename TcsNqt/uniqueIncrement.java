package TcsNqt;

import java.util.*;

public class uniqueIncrement{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.print("Wrong Input");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                System.out.print("Wrong Input");
                return;
            }
            arr[i] = sc.nextInt();

            if (arr[i] < 0) {
                System.out.print("Wrong Input");
                return;
            }
        }

        // if extra inputs exist -> Wrong Input
        if (sc.hasNext()) {
            System.out.print("Wrong Input");
            return;
        }

        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.print(sum);
    }
}