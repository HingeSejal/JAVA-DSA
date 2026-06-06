package CoreJava.OOP;
public class demo{
    public static void main(String[] args) {
        System.out.println("Hello World");
        main(args);
    }
}

//hello world keep printing because of recursive call to main method. 
//It will throw stack overflow error.
//In Java, the main method is the entry point of the program. 
//When you call main(args) inside the main method, it creates a new instance of the main method, which again calls itself, leading to an infinite loop of method calls. 
//This eventually exhausts the stack memory allocated for the program, resulting in a StackOverflowError.