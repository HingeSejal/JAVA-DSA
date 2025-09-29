package TCA;


class A{
	int i;
	 static int c=0;
	 A(){
		 i=0;
		 c++; 
	 }
	 A(int x){
		 i=x;
		 c++; 
	 }
	 void display() {
		 System.out.println(i);
	 }
	 static void show() {
		 System.out.println("No of objects created = "+ c);
	 }
}
public class static_need {
  public static void main(String args[]) {
	  A obj1 = new A();
	  A obj2 = new A(5);
	  obj1.display();
	  obj2.display();
	  
	  A.show();
	  
  }
}

