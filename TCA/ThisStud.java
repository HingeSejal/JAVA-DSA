package TCA;
import java.io.*;

class student {
  private int rno;
  private String name;
  private double per;

  student(){
    
    this(54,"Seja",87);
    System.out.println("Empty constructor");
  }
   student(int rno , String name , double per){
   this.rno = rno;
   this.name = name;
   this.per = per;
   }

   void display(){
    System.out.println("xyz display content");
    System.out.println("rno:"+rno);
   System.out.println("name:"+name);
   System.out.println("percent:"+per);
   }
  
}

public class ThisStud {
    public static void main(String args[]){
       student ob1 = new student();
       ob1.display();
       System.out.println("--------------");
       student ob2 = new student(89,"Man",90);
       ob2.display();

    }
}
