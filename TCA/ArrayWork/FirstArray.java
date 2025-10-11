package TCA.ArrayWork;

import java.io.* ;

class Student {
	
	private int rno;
	private String name;
	private double per;
	
	Student(){
	    this(54,"Seja",87);
	    System.out.println("Empty constructor");
	  }
	
	   Student(int rno , String name , double per){
	   this.rno = rno;
	   this.name = name;
	   this.per = per;
	   }

	   void display(){
	    System.out.println("------------display content----------");
	    System.out.println("rno:"+rno);
	   System.out.println("name:"+name);
	   System.out.println("percent:"+per);
	   }
	
}

public class FirstArray {
	
  public static void main(String[] args) throws Exception
  {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  
	  System.out.println("How many student:");
	  int n= Integer.parseInt(br.readLine());
	  
	  Student S[] = new Student[n];
	  
	  for(int i=0;i<S.length;i++) {
		  System.out.println("Enter the Roll No:");
		  int r = Integer.parseInt(br.readLine());
		  
		  System.out.println("Enter the Name:");
		  String nm = br.readLine();
		  
		  System.out.println("Enter percent:");
		  double p = Double.parseDouble(br.readLine());
		  
		  S[i] = new Student(r,nm,p);
		  
	  }
	  
	  for(int i=0;i<S.length;i++) {
		  
		  S[i].display();
		  
	  }
  }
}
