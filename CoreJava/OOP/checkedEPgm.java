package CoreJava.OOP;

public class checkedEPgm {

    public static void main(String[] args) {
        try {
            int a = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}

/*
Checked Exception
Compile time pe check hota hai
Handle karna mandatory hota hai (try-catch ya throws)
Example: IOException, SQLException

2. Unchecked Exception
Runtime pe aata hai
Handle karna optional hota hai
Example: ArithmeticException, NullPointerException
*/