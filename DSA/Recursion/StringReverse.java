package DSA.Recursion;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) { //str= "Hello World"
        if (str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        // str.charAt(str.length() - 1)  is the last character of the string // charAt(10) = "d"
        // reverseString(str.substring(0, str.length() - 1)) is the rest of the string without the last character // "Hello Worl"
    }
}

//time complexity is O(n) where n is the length of the string