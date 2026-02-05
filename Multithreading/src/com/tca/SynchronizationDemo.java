package com.tca;

class Resource 
{
	int cnt = 0;
	
	public  void increment()
	{
		synchronized(this) //synch block
		{
		cnt++;
		}
	}
	
//	public  synchronized void increment(){ //sync method
//		cnt++;
//	}
	
//	public void increment(){
//		cnt++;
//	}
}

class AddThread extends Thread
{
	Resource r;

	public AddThread(Resource r) {
		this.r = r;
	}
	
	public void run() {
		for(int i=1;i<=5000;i++) {
			r.increment();
		}
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Resource r = new Resource();				
		//Diamond - washroom
		
		AddThread t1 = new AddThread(r);
		t1.start();
		//allocate washroom 
		
		AddThread t2 = new AddThread(r);
		t2.start();
		
		t1.join();//2000
		t2.join(); //2000
		System.out.println("Counter i : "+ r.cnt);
		
	}
}

/*
	Thread Synchronization is a mechanism that ensures only one thread can access 
	the critical section(shared resource) at a time
	
	if we didn't synchronized  the shared resources can be use by multiple thread, manipulating the content leading to errors
	
*/