package TCA;
import java.io.* ;

class Student {
	
	private int rno;
	private String name;
	private double per;
	
	public int getRno() {
		return rno;
	}


	public void setRno(int rno) {
		this.rno = rno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPer() {
		return per;
	}


	public void setPer(double per) {
		this.per = per;
	}


	   void display(){
	    System.out.println("------------display content----------");
	    System.out.println("rno:"+rno);
	   System.out.println("name:"+name);
	   System.out.println("percent:"+per);
	   }
	
}

public class getsetArray{
	
  public static void main(String[] args) throws Exception{ 
	  
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
		  
		  S[i] = new Student();
		  
	  }
		  for(int i=0;i<S.length;i++) {
		  S[i].getRno();
		  S[i].getName();
		  S[i].getPer();
		  
	  }
	  
	  for(int i=0;i<S.length;i++) {
		  
		  S[i].setRno(76);
		  S[i].setName("sej");
		  S[i].setPer(89);
		  
	  }
	  
	  
  }
}
