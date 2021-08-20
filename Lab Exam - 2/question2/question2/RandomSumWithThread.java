package question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Randomizer implements Runnable {
	private Integer randomNumber;
	
	
	@Override
	public void run() {
		Random randomObj = new Random();
		// Numbers between 1 and 10 =~ (1,10) i.e. Open range
		randomNumber = randomObj.nextInt(8)+2;
		System.out.println("The generated no. is: "+ randomNumber);
	}


	public Integer getRandomNumber() {
		return randomNumber;
	}
}


public class RandomSumWithThread {

	public static void main(String[] args) {
		//Creating list for storing multiple runnable objects
		List<Randomizer> runnableObjectArray= new ArrayList<>();
		
		// Adding 5 new Objects to the list
		for (int i=0; i<5; i++) {
			runnableObjectArray.add(new Randomizer());
		}
		
		// Creating new threads
		Thread thread1 = new Thread(runnableObjectArray.get(0));
		Thread thread2 = new Thread(runnableObjectArray.get(1));
		Thread thread3 = new Thread(runnableObjectArray.get(2));
		Thread thread4 = new Thread(runnableObjectArray.get(3));
		Thread thread5 = new Thread(runnableObjectArray.get(4));
		
		// Starting new threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		// Holding main till all threads do join
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Calculating sum using stream
		int sum = runnableObjectArray.stream().mapToInt(o->o.getRandomNumber()).sum();
		System.out.println("The sum of all numbers is: "+ sum);
	}

}
