package assignment5.question1;
import java.lang.Runnable;
import java.lang.Thread;

class PrintNumber {
	static volatile int var=-1;
	
	void print() {
		synchronized(this) {
		System.out.println(Thread.currentThread().getName() +" : "+ ++var);
		}
	}
}


public class ZeroToHundred implements Runnable {
	static int threadCount=-1;
	private PrintNumber printnumber;
	private Thread thread;
	
	ZeroToHundred (PrintNumber printnumber) {
		this.printnumber = printnumber;
		this.thread = new Thread(this);
		threadCount++;		
	}
	public void go() {
		this.thread.start();
	}
	
	@Override
	public void run() {
		while(PrintNumber.var<100-2) //replace 2 with threadCount
			this.printnumber.print();
	}
	
	public static void main(String[] args) {
		PrintNumber printnumber = new PrintNumber();
		ZeroToHundred zth1 = new ZeroToHundred(printnumber);
		ZeroToHundred zth2 = new ZeroToHundred(printnumber);
		ZeroToHundred zth3 = new ZeroToHundred(printnumber);
		
		zth1.go();
		zth2.go();
		zth3.go();
		
	}

}
