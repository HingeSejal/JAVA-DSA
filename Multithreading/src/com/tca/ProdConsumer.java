package com.tca;

import java.util.LinkedList;

class Resource1
{
	LinkedList<Integer> buffer = new LinkedList<>();
	int capacity=5;
	
	public void produce() throws InterruptedException
	{
		int value =0;
		while(true) {
			
			synchronized(this)
			{
				while(buffer.size()==capacity)
				{
					wait();
				}
				buffer.add(value);
				System.out.println("Producer produced : "+ value);
				value++;
				notify();
				
			}
			Thread.sleep(1000);
		}
	}
	
	public void consume() throws InterruptedException
	{
		
		while(true) {
			
			synchronized(this)
			{
				while(buffer.size()==0)
				{
					wait();
				}
				int value = buffer.removeFirst();
				System.out.println("Consumer  consumed : "+ value);
				
				notify();
				
			}
			Thread.sleep(1000);
		}
	}
}

class ProducerThread extends Thread
{
	Resource1 r ;
	
	//constructor
	public ProducerThread(Resource1 r) {  
		this.r = r;
	}
	
	public void run() {
		try {
			r.produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ConsumerThread extends Thread
{
	Resource1 r ;
	
	//constructor
	public ConsumerThread(Resource1 r) {  
		this.r = r;
	}
	
	public void run()  {
		try {
			r.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ProdConsumer {

	public static void main(String args[]) {
		
		Resource1 r = new Resource1();
		
		//producer nust banavatach nhi rahnar..jr khanar available nasel
		
		ProducerThread pt = new ProducerThread(r); //allocatedd memory to resource
		ConsumerThread ct = new ConsumerThread(r);
		
		pt.start();
		ct.start();
	}

}


/*
  	producer is synchronised with consumer by 
  	wait()
  	notify()        -> jo pahile aala to - first req rest
  	notifyAll()		-> sarv ekhsath aale tr priority nusar
  	
  	jr producer in common area vr 11 lihila
  	and at same time consumer la memory need hoti so tyane 12 overritr kela so past record is lost
  	hence using synch only one thread complete its work at a time and second thread will wait
  	
  	
  	Use BUfferreader to take inputs in multithreading.. cause BUfferreader is synchronised
  	Arraylist are not synchronised - not thread safe where
  	Vector is synchronised 
 */
