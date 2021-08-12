package java8.concurrent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Random rand = new Random();
		Integer aRandomInteger = rand.nextInt(50);
		System.out.println("Random integer is: "+aRandomInteger+" Current thread: "+ Thread.currentThread());
		return aRandomInteger;
	}
	
}

public class ThreadPool {
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.submit(new MyThread());
		//es.execute(null);
		ExecutorService es1 = Executors.newFixedThreadPool(4);
		es1.submit(new MyThread());
		es1.submit(new MyThread());
		es1.submit(new MyThread());
		es1.submit(new MyThread());
	}

}
