package threads.producerconsumer;

import java.util.Optional;

class Q {
	private int n;
	boolean valueSet=false;
	
	public synchronized int get() {
		if(!valueSet) {
			try {
				wait();
			}catch(InterruptedException ex) {}
		}
		System.out.println("get: "+ n);
		valueSet=false;
		notifyAll();
		return n;
	}

	public synchronized void put(int n) {
		if(valueSet) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		this.n = n;
		valueSet=true;
		System.out.println("put: "+ n);
		notifyAll();
	}
}

class Producer1 implements Runnable {
	private Q q;
	private Thread thread;

	public Producer1(Q q) {
		this.q = q;
		this.thread = new Thread(this);
		this.thread.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}
}

class Consumer1 implements Runnable {
	private Q q;
	private Thread thread;

	public Consumer1(Q q) {
		this.q = q;
		this.thread = new Thread(this);
		this.thread.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.get();
		}
	}
}


public class Taught {

	public static void main(String[] args) {
		Q q = new Q();
		Producer1 producer = new Producer1(q);
		Consumer1 consumer = new Consumer1(q);

	}
	
}
