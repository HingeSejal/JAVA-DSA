package com.tca;

class PrintTextThread extends Thread
{
	String msg;
	int n;
	
	public PrintTextThread(String msg , int n) {
		this.msg = msg;
		this.n = n;
	}
	
//	public void run()
//	{
//		System.out.println("Message :"+ msg);
//		System.out.println("N :"+ n);
//	}
	
	public void run() {
		for(int i=0;i<n;i++) {
			System.out.println(i+" : "+ msg);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

public class PrintTextDemo {

	public static void main(String[] args) {
		
		PrintTextThread t1 = new PrintTextThread("INDIA",5);
		t1.start();
		
		PrintTextThread t2 = new PrintTextThread("AUS",4);
		t2.start();
	}

}
