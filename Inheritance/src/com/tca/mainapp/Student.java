package com.tca.mainapp;
import java.io.* ;

class Student2020 {
	private String name;
	private int rno;
	private String email;
	
	public Student2020(String name ,int rno,String email) {
		this.name = name;
		this.rno = rno;
		this.email = email;	
	}
	
	public void display() {
		System.out.println(name+"\t"+rno+"\t"+email);
		
	}
}

class Student2025 extends Student2020{
	private double per;
	private String status;
	
	public Student2025(String name, int rno, String email, double per, String status) {
		super(name, rno, email);
		this.per = per;
		this.status = status;
	}
	
	public void display() {
		super.display();
		System.out.println(per+"\t"+status);
		
	}
}

public class Student {

	public static void main(String[] args) throws Exception{ 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("How many Student?");
		int n = Integer.parseInt(br.readLine());
		
		Student2025 ob[] = new Student2025[n];
		
		for( int i=0; i<n;i++) {
			System.out.println("Roll Number?");
			int rno = Integer.parseInt(br.readLine());
			
			System.out.println("Name?");
			String name = br.readLine();
			
			System.out.println("Email?");
			String email = br.readLine();
			
			System.out.println("Per?");
			double per = Double.parseDouble(br.readLine());
			
			System.out.println("status?");
			String status = br.readLine();
			
			ob[i]= new Student2025(name,rno,email,per,status);
		}

	
	for( int i=0; i<n;i++) {		
		ob[i].display();
	}
}

}
