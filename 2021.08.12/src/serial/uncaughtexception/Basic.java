package serial.uncaughtexception;

class MyJob implements Runnable {

	@Override
	public void run() {
		System.out.println("This is some task by thread: "+Thread.currentThread().getName());		
		try {
		throw new NullPointerException();
		}
		catch(NullPointerException e) {
			System.out.println("Exception is handled");
		}
	}
	
}


public class Basic {

	public static void main(String[] args) {
		MyJob job1 = new MyJob();
		Thread thread1 = new Thread(job1);
		thread1.start();

	}

}
