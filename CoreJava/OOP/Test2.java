package CoreJava.OOP;

class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }

public class Test2 {
    public static void main(String[] args) {

        Animal a = new Dog();

        if (a instanceof Dog) {
            System.out.println("This is Dog");
            // checks if it is of type Dog(a child of Animal) or not
        } else if (a instanceof Cat) {
            System.out.println("This is Cat");
        }
    }
}