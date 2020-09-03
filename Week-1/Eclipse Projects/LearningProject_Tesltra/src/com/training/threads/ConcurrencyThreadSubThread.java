package com.training.threads;

public class ConcurrencyThreadSubThread implements Runnable {

	private ConcurrencyThreadDemo op; //as of now only add() of this class will work because in run() 
	//we have written only add() and not written sub()
		private Thread t;
		
		public ConcurrencyThreadSubThread(ConcurrencyThreadDemo op, String threadName) {
		super();
		this.op = op;
		this.t = new Thread(this);
		this.t.setName(threadName);
		this.t.start();
		}
		
		@Override
		public void run() {
		op.sub(2);
	}
}
