package parallel.producerandconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.Map;
class Producer implements Runnable {
    private BlockingQueue<Integer> que;
 
    public Producer(BlockingQueue<Integer> que) {
        this.que = que;
    }
 
    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                System.out.println("produce : " + ++i);
                que.put(i);
 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 
}
 
class Consumer implements Runnable {
    private BlockingQueue<Integer> que;
 
    public Consumer(BlockingQueue<Integer> que) {
        this.que = que;
    }
 
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("get : " + que.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 
}

public class Implementation {
	// 1. create a blocking queue of size 10
    BlockingQueue<Integer> que = new ArrayBlockingQueue<Integer>(1);

    Producer producer = new Producer(que);
    Consumer consumer = new Consumer(que);

    Thread thread1 = new Thread(producer);
    Thread thread2 = new Thread(consumer);

    //thread1.start();
   // thread2.start();

    // create a class Producer
    // ............... consumer
    // start both
}
