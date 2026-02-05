package com.tca;

class AusThread1 implements Runnable 
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

class IndiaThread2 implements Runnable
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


public class RunnableThread {

	public static void main(String[] args) {
		Thread  t1 = new Thread(new IndiaThread2() );
		t1.start(); //Allocating required resources stack , cpu registers, pc/ip
		
		Thread t2 = new Thread(new AusThread1() );
		t2.start(); //Allocating required resources stack , cpu registers, pc/ip
		
		try {
			for(int i=1;i<5;i++) {
			System.out.println(i+" : Main"); //work parallely
			Thread.sleep(1000);
//			t2.interrupt();  //Sleep Interrupt Exception
			} 
		}
		catch (InterruptedException e) {
				e.printStackTrace();
		}
		

	}

}
//even if main thread terminates, child thread can continue its execution
//Demon thread is low priority thread which runs in bg ex.garbage collector
//program madhe multitasking hot nhi process madhe hote