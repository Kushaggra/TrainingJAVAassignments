package com.training.threads;

public class Main {

	public static void main(String[] args) {
		
		
		//Default priority is 5, 
		// 9 being higher priority and 
		// 1 being lower
		threadClass1 tobj = new threadClass1();
		Thread t1 = new Thread(tobj);
		t1.setName("thread1");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		Thread t2= new Thread(tobj);
		t2.setName("Thread 2");
		t2.setPriority(7);
		t2.start();
		
		Thread t3= new Thread(tobj);
		t3.setName("Thread 3");
		t3.setPriority(5);
		t3.start();
		
		Thread t4= new Thread(tobj);
		t4.setName("Thread 4");
		t4.setPriority(3);
		t4.start();
		
		
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		t1.yield();
//		ThreadClass2 t3 = new ThreadClass2();
//		t3.setName("Thread 3");
//		
//// if we call run() directly - it acts as normal method and not as a THREAD
////		t3.run();
//		
////		Thus we need to call start() in order to call run();
//		t3.start();
//		
//		
//		ThreadClass2 t4 = new ThreadClass2();
//		t4.setName("Thread 4");
//		
//		t4.start();


	}

}
