package serial.producerandconsumer;

class MyJob implements Runnable {

	@Override
	public void run() {
		System.out.println("This is some task by thread: "+Thread.currentThread().getName());		
	}
	
}

//class Producer

public class ProducerConsumerImpl {

	public static void main(String[] args) {
		MyJob job1 = new MyJob();
		Thread thread1 = new Thread(job1);
		thread1.start();
	}

}
