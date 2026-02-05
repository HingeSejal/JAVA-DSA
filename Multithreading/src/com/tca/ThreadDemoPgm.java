package com.tca;

class AusThread extends Thread
{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(i+" : Australia");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class IndiaThread extends Thread
{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(i+" : INDIA");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class ThreadDemoPgm {

	public static void main(String[] args) {
		
		IndiaThread  t1 = new IndiaThread();
		t1.start(); //Allocating required resources stack , cpu registers, pc/ip
		
		AusThread t2 = new AusThread();
		t2.start(); //Allocating required resources stack , cpu registers, pc/ip
		
		for(int i=1;i<5;i++) {
			System.out.println(i+" : Main");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}

/*
  start is build-in thread method which internally calls run method
  thread can be created by following two methods
  1) extending thread class 
  2) Runnable interface
*/