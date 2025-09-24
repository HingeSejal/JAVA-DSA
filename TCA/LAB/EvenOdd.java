package TCA.LAB;

class even extends Thread{
    public void run(){
        for(int i=2;i<=10;i+=2){
            System.out.println("Even"+i);
        }
    }
}
class odd extends Thread{
    public void run(){
        for(int i=1;i<=10;i+=2){
            System.out.println("Odd"+i);
        }
    }
}
public class EvenOdd {
public static void main(String[] args){
  even e = new even();
  odd o = new odd();
  e.start();
  o.start();
}
    
}
