package com.tca;

import java.util.Arrays;
import java.util.Random;

class SumThread extends Thread 
{
	int a[];
	int start;
	int end;
	int sum;
	
	public SumThread (int a[] , int start, int end) {
		this.a = a;
		this.start = start;
		this.end = end;
		this.sum = 0; //always initialised to 0
	}

	public void run()
	{
		for(int i= start ; i<=end ; i++) {
			sum = sum + a[i];
		}
	}
}


public class SumThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		int n=70;
		int arr[] = new int[n];
		
		System.out.println("Before : "+Arrays.toString(arr));
		
		Random r = new Random();
		
		for(int i=0;i<n;i++) {
			arr[i] = r.nextInt()%100;
		}
		
		System.out.println("After : "+Arrays.toString(arr));
		
		SumThread t1 = new SumThread(arr,0,35);
		SumThread t2 = new SumThread(arr,35,69);
		
		t1.start();
		t2.start();
		
		t1.join(); 
		t2.join();
		// main thread will continue its execution once t1 and t2 thread finish
		int total = (t1.sum)+(t2.sum);
		System.out.println("Sum of " + n +" numbers : "+ total); 
		//gives zero because main is done with its task and t1 , t2 is still working  
		
		//time complexity - n/2

	}

}
