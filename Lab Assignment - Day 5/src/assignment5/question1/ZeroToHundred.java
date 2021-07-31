package assignment5.question1;
import java.lang.Runnable;
import java.lang.Thread;

public class ZeroToHundred implements Runnable {
	static int count=-1;
	@Override
	public void run() {
		//synchronized() {
		while(count<100)
			System.out.println(Thread.currentThread().getName()+" : "+ ++count);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//}
	}
	
	public static void main(String[] args) {
		ZeroToHundred zth = new ZeroToHundred();
		
		Thread t1 = new Thread(zth, "Thread1") ;
		Thread t2 = new Thread(zth, "Thread2") ;
		Thread t3 = new Thread(zth, "Thread3") ;
		
		t1.start();
		t2.start();
		t3.start();
	}

}
