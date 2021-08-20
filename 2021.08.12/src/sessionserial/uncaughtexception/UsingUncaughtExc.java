package sessionserial.uncaughtexception;

import java.lang.Thread.UncaughtExceptionHandler;

class MyJob1 implements Runnable {

	@Override
	public void run() {
		System.out.println("This is some task by thread: " + Thread.currentThread().getName());
		throw new NullPointerException("Null pointer exception");
	}
}

class UCEHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("This is handler, and Exception message is: "+ e.getMessage());
	}

}

public class UsingUncaughtExc {

	public static void main(String[] args) {
		MyJob1 job1 = new MyJob1();
		Thread thread1 = new Thread(job1);
		thread1.setUncaughtExceptionHandler(new UCEHandler());
		thread1.start();

	}

}
