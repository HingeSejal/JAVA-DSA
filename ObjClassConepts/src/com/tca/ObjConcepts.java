package com.tca;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

class Student{
	private int rno;
	private String name;
	private double per;
    
	public Student() {}
	
	public Student(int rno, String name,double per)
	{
		this.rno = rno;
		this.name = name;
		this.per = per;
	}

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

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + "]";
	}
	
	public void display() {
		System.out.println("Roll Num: " + getRno());
		System.out.println("Name: " + getName());
		System.out.println("Percentage: " + getPer());
	}
	
}

public class ObjConcepts {

	public static void main(String[] args) {
		
		Class<Student> c =Student.class;
		System.out.println("Parent class: " + c.getSuperclass());
		
		System.out.println("-----------DATA MEMEBERS/FIELDS---------------");
		
		Field f[] = c.getDeclaredFields();
		for(Field field : f) {
			System.out.println(field);
		}
		
		System.out.println("-----------Constructors---------------");
		
		Constructor constructor[] = c.getDeclaredConstructors();
		for(Constructor con : constructor) {
			System.out.println(con);
		}
		
		System.out.println("-----------Methods---------------");
		
		Method M[] = c.getDeclaredMethods();
		for(Method method : M) {
			System.out.println(method);
		}
		
		
		
		
	}

}
