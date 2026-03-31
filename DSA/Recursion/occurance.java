package DSA.Recursion;

//find the first and last occurance of a character in a string
public class occurance {
    public static void main(String[] args) {
        String str = "hello world";
        char target = 'o'; // o is present at index 4 and 7
        int firstOccurance = findFirstOccurance(str, target, 0);
        int lastOccurance = findLastOccurance(str, target, str.length() - 1);
        System.out.println("First occurance: " + firstOccurance);
        System.out.println("Last occurance: " + lastOccurance);
    }

    public static int findFirstOccurance(String str, char target, int index) {
        if (index >= str.length()) {
            return -1;
        }
        if (str.charAt(index) == target) {
            return index;
        }
        return findFirstOccurance(str, target, index + 1);
    }

    public static int findLastOccurance(String str, char target, int index) {
        if (index < 0) {
            return -1;
        }
        if (str.charAt(index) == target) {
            return index;
        }
        return findLastOccurance(str, target, index - 1);   
    }
}
