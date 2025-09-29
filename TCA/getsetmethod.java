package TCA;
 

class student{
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
}

public class getsetmethod {

	public static void main(String[] args) {
		
		student S1 = new student(); //0 null 0.0
		System.out.println("rno:"+S1.getRno());
		   System.out.println("name:"+ S1.getName());
		   System.out.println("percent:"+S1.getPer());
		   
		   student S2 = new student();
			S2.setRno(54);
			S2.setName("seja");
			S2.setPer(95);
			
			System.out.println("rno:"+S2.getRno());
			   System.out.println("name:"+ S2.getName());
			   System.out.println("percent:"+S2.getPer());
 
	}

}
