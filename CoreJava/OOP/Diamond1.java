package CoreJava.OOP;

interface A {
    default void show() {
        System.out.println("From A");
    }
}

interface B extends A {
     default void show() {
        System.out.println("From B");
    }
 }

interface C extends A { 
     default void show() {
        A.super.show(); //from A
        System.out.println("From C");
    }
}

class Diamond1 implements B, C {
    public void show() {
        B.super.show(); //from B
        C.super.show(); //from C
    }

    public static void main(String[] args) {
        Diamond1 obj = new Diamond1();
        obj.show();
    }
}