package DSA.Strings;


public class ReverseString {
    public static void main(String[] args) {

        String str = "hello jspm";
        
        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        str = new String(arr);

        System.out.println("Reversed String: " + str);
    }
}