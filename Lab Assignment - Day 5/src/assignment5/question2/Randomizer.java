package assignment5.question2;
import java.lang.Runnable;
import java.lang.Thread;
import java.util.Random;

class Randomize implements Runnable {
	Thread thread;
	private static int counter=-1;
	public static int [] numArray=null;
	
	Randomize() {
		this.thread = new Thread(this);
	}
	
	Randomize(String threadName) {
		if(counter<0)
			counter = 0;
		this.thread = new Thread(this, threadName);
	}
	
	@Override
	public void run() {
		Random r = new Random();
		
		try {
			this.rand(r.nextInt(10)+1);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void rand(int number) throws Exception {
		if(numArray==null)
			throw new Exception("The array must be initialized first!");
		
		synchronized(this) {
			if(counter<numArray.length) {
				counter=counter+1;
				numArray[counter] = number;
			}
			else
				System.out.println("Array is already filled!");
		}
	}
	
	public static void displaySum() {
		int sum=0;
		System.out.println("The sum of random no.s:");
		for(int n=0; n<=counter; n++) {
			System.out.print(numArray[n]);
			if(!(n+1>counter))
			System.out.print(", ");
			sum+=numArray[n];
		}
		System.out.print(" is: "+sum);
	}
	
}

public class Randomizer {
	
	public static void main(String[] args) {
		
		Randomize.numArray = new int[5];
		
		Randomize r1 = new Randomize();
		Randomize r2 = new Randomize();
		Randomize r3 = new Randomize();
		Randomize r4 = new Randomize();
		Randomize r5 = new Randomize();
		
		r1.thread.start();
		r2.thread.start();
		r3.thread.start();
		r4.thread.start();
		r5.thread.start();
		
		try {
			r1.thread.join(6000);
			r2.thread.join(6000);
			r3.thread.join(6000);
			r4.thread.join(6000);
			r5.thread.join(6000);
		} 
		catch (InterruptedException e) {};
		Randomize.displaySum();
	}

}
