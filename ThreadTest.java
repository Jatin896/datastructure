package com.test;
import java.util.concurrent.atomic.AtomicInteger;
public class ThreadTest {
	
	private AtomicInteger count = new AtomicInteger(0);

	public static void main(String args[]) throws InterruptedException {
		ThreadTest test = new ThreadTest();
		test.newWork();
		System.out.println("After thread.. " );
	}

	private void newWork() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(() ->  
		{
			for(int i =0;i<1000;i++) {
			//System.out.println("In Thread 1" +i);
				count.getAndIncrement();
			}
		}
				
				); 
		Thread t2 = new Thread(() ->  
		{
			for(int i =0;i<1000;i++) {
			//System.out.println("In Thread 1" +i);
				count.getAndIncrement();
			}
		}
				
				); 
		t1.start();
		
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count " +count );
	}
}
