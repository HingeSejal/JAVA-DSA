package DSA.Array;

public class findseq {

    public static int findConsequentSequence(int[] arr) {
        java.util.Arrays.sort(arr);
        int maxLength = 1;
        int currentLength = 1;
        int startIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currentLength++;
            } else if (arr[i] != arr[i - 1]) {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = i - currentLength;
                }
                currentLength = 1;
            }
        }

        // Check for the last sequence
        if (currentLength > maxLength) {
            maxLength = currentLength;
            startIndex = arr.length - currentLength;
        }

        int[] longestSequence = new int[maxLength];
        System.arraycopy(arr, startIndex, longestSequence, 0, maxLength);
        return longestSequence; 
    }
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        int[] longestSequence = findConsequentSequence(arr);
    }
}
