package com.training.threads;

public class ConcurrencyThreadDemo {
	private int i=0;
	
	public synchronized void add(int n) {
		this.notify();
		i+=n;
		System.out.println("Add="+i);
	}
	public synchronized void sub(int n) {
		
		if(i<=0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		i-=n;
		System.out.println("Sub="+i);
	}
}
