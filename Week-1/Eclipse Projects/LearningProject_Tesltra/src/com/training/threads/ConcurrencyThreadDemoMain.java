package com.training.threads;

public class ConcurrencyThreadDemoMain {

	public static void main(String[] args) {
		ConcurrencyThreadDemo mob = new ConcurrencyThreadDemo();
	
//		We have more subtracts than additions, but because of the
//		notify() and wait() we never get to the negative values
		
		ConcurrencyThreadDemoAddThread t1 = new ConcurrencyThreadDemoAddThread(mob, "Thread1");
		ConcurrencyThreadDemoAddThread t2 = new ConcurrencyThreadDemoAddThread(mob, "Thread2");
		

		ConcurrencyThreadSubThread t3 = new ConcurrencyThreadSubThread(mob,"Thread3");
		ConcurrencyThreadSubThread t4 = new ConcurrencyThreadSubThread(mob,"Thread4");
		ConcurrencyThreadSubThread t5 = new ConcurrencyThreadSubThread(mob,"Thread5");
		ConcurrencyThreadSubThread t6 = new ConcurrencyThreadSubThread(mob,"Thread6");
		ConcurrencyThreadSubThread t7 = new ConcurrencyThreadSubThread(mob,"Thread7");
		ConcurrencyThreadSubThread t8 = new ConcurrencyThreadSubThread(mob,"Thread8");
		ConcurrencyThreadSubThread t9 = new ConcurrencyThreadSubThread(mob,"Thread9");
	
	
	
	
	}

}
