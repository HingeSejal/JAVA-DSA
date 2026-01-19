package com.tca.abstractStaff;

public class FullTImeStaff extends Staff
{
	
 private String dept;
 private double salary;

 public FullTImeStaff() {}

 public FullTImeStaff(String name, String add, String dept , double salary) {
	super(name, add);
	this.dept = dept;
	this.salary = salary;
 }

 public String getDept() {
	return dept;
 }

 public void setDept(String dept) {
	this.dept = dept;
 }

 public double getSalary() {
	return salary;
 }

 public void setSalary(double salary) {
	this.salary = salary;
 }
 
 
 @Override
 public void display() {
	 System.out.println("Staff Name : "+ this.getName());
	 System.out.println("Staff Address : "+ this.getAdd());
	 System.out.println("Staff Dept : "+ this.getDept());
	 System.out.println("Staff Salary : "+ this.getSalary());
 }
 
 
 
		 
}
