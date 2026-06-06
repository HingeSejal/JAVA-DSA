package CoreJava.OOP;

public class uncheckedEPgm {
    public static void main(String[] args) {
        int a = 10 / 0; // This will throw ArithmeticException
        System.out.println("This line will not be executed due to the exception.");
    }
}
