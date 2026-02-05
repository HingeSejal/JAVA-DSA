package com.tca;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello Users !");
		
		Thread t = Thread.currentThread();
		
		System.out.println("Thread : "+ t);
		System.out.println("--------------------------------------");
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getThreadGroup());
		System.out.println("is Running : "+ t.isAlive());
		System.out.println("--------------------------------------");
		
		t.setName("Sejal");
		t.setPriority(1);
		
		System.out.println("Thread : "+ t);
		System.out.println("--------------------------------------");
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
	}

}
