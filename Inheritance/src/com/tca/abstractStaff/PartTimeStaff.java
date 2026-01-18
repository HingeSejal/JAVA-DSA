package com.tca.abstractStaff;

public class PartTimeStaff extends Staff {
	
	private int no_hrs;
	private int rateperhr;

	public PartTimeStaff() {
		super();
	};

	public PartTimeStaff(String name, String add,int no_hrs, int rateperhr) {
		super(name, add);
		this.no_hrs = no_hrs;
		this.rateperhr = rateperhr;
	}

	public int getNo_hrs() {
		return no_hrs;
	}

	public void setNo_hrs(int no_hrs) {
		this.no_hrs = no_hrs;
	}

	public int getRateperhr() {
		return rateperhr;
	}

	public void setRateperhr(int rateperhr) {
		this.rateperhr = rateperhr;
	}

	 @Override
	 public void display() {
		 System.out.println("Staff Name : "+ this.getName());
		 System.out.println("Staff Address : "+ this.getAdd());
		 System.out.println("Staff hrs : "+ this.getNo_hrs());
		 System.out.println("Staff rate/hr : "+ this.getRateperhr());
		 System.out.println("TOTAL salary : " + (this.getNo_hrs())*(this.getRateperhr()));
	 }
}
