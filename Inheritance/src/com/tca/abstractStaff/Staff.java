package com.tca.abstractStaff;

public abstract class Staff {
	private String name;
	private String add;
	
	public Staff() {};
	

	public Staff(String name, String add) {
		super();
		this.name = name;
		this.add = add;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	};
	
	public abstract void display();
	
		
}
