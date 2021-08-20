package sessionserial.producerandconsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class FastProducer implements Runnable {
	BlockingQueue<Integer> producerQueue;
	FastProducer(BlockingQueue<Integer> queue) {
		this.producerQueue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				producerQueue.put(getInt());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Integer produced");
		}
	}
	
	Integer getInt() {
		Random randomObj = new Random();
		return Integer.valueOf(randomObj.nextInt(99));
	}
	
}

class SlowConsumer implements Runnable {
	BlockingQueue<Integer> consumerQueue;
	SlowConsumer(BlockingQueue<Integer> queue) {
		this.consumerQueue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Consumer Sleep INTERRUPTED");
			}
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

public class FastProducerSlowConsumer {

	public static void main(String[] args) {
		BlockingQueue<Integer> mainQueue = new ArrayBlockingQueue<Integer>(5);
		Thread producerThread = new Thread(new FastProducer(mainQueue));
		Thread consumerThread = new Thread(new SlowConsumer(mainQueue));
		
		producerThread.start();
		consumerThread.start();
		
//		Thread consumerThread1 = new Thread(new SlowConsumer(mainQueue));
//		Thread consumerThread2 = new Thread(new SlowConsumer(mainQueue));
//		Thread consumerThread3 = new Thread(new SlowConsumer(mainQueue));
//		Thread consumerThread4 = new Thread(new SlowConsumer(mainQueue));
//		Thread consumerThread5 = new Thread(new SlowConsumer(mainQueue));
//		
//		consumerThread1.start();
//		consumerThread2.start();
//		consumerThread3.start();
//		consumerThread4.start();
//		consumerThread5.start();
	}

}
