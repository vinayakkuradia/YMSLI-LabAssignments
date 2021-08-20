package sessionserial.producerandconsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
	BlockingQueue<Integer> producerQueue;
	Producer(BlockingQueue<Integer> queue) {
		this.producerQueue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Producer INTERRUPTED");
			}
			producerQueue.add(getInt());
			System.out.println("Integer produced");
		}
	}
	
	Integer getInt() {
		Random randomObj = new Random();
		return Integer.valueOf(randomObj.nextInt(99));
	}
	
}

class Consumer implements Runnable {
	BlockingQueue<Integer> consumerQueue;
	Consumer(BlockingQueue<Integer> queue) {
		this.consumerQueue = queue;
	}

	@Override
	public void run() {
		while(true) {
			take();
		}	
	}
	
	void take() {
		try {
			System.out.println("Consumed: "+consumerQueue.take());
		} catch (InterruptedException e) {
			System.out.println("Consumer INTERRUPTED");
		}
		
	}
	
}


public class ProducerConsumerImpl {

	public static void main(String[] args) {
		BlockingQueue<Integer> mainQueue = new ArrayBlockingQueue<Integer>(5);
		Thread producerThread = new Thread(new Producer(mainQueue));
		Thread consumerThread = new Thread(new Consumer(mainQueue));
		
		producerThread.start();
		consumerThread.start();
	}

}
