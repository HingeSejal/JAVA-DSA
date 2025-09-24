package TCA;
import java.io.* ;

class A {
    private int i ;
    private int j;


A(){
    this(-1,-1);
    System.out.println("Im empty cnstructor");
}

A(int i ,int j){
    System.out.println("Im parameterised constructor");
    this.i = i;
    this.j = j;
}


void display(){
    System.out.println("im in display");
    System.out.println("value of i:"+i);
    System.out.println("valur of j:"+j);
    this.show() ;
}

void show(){
    System.out.println("Im in show");
    System.err.println("Baackout");
}
}

public class ThisPgm {
    public static void main(String args[]){
        A ob1 = new A();
        ob1.display();
        System.out.println("----------------");
         A ob2 = new A(11,22);
        ob2.display();
    }
}
