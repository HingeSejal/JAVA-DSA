package CoreJava.OOP;

class Animal { }

class Dog extends Animal { }

public class Test {
    public static void main(String[] args) {

        Animal a = new Dog();

        System.out.println(a instanceof Dog);     //true 
        System.out.println(a instanceof Animal);  //true
//--------------------------------------------------------------------
        Animal b = new Animal();
        System.out.println(b instanceof Dog);     //false
        System.out.println(b instanceof Animal);  //true

//--------------------------------------------------------------------
        Dog c = new Dog();
        System.out.println(c instanceof Dog);     //true
        System.out.println(c instanceof Animal);  //true

    }
}