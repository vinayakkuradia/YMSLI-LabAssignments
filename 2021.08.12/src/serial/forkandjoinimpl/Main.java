package serial.forkandjoinimpl;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class Main {
	
	public static void main(String[] args) {
		ForkJoinPool newPool = new ForkJoinPool();
		TheTask newTask = new TheTask();
		int result = newPool.invoke(newTask);
		System.out.println(result);
	}
	
	static class TheTask extends RecursiveTask<Integer> {

		private static final long serialVersionUID = -7519649523067712167L;

		@Override
		protected Integer compute() {
			ForkJoinTask<Integer> task1 = this.fork();
			ForkJoinTask<Integer> task2 = this.fork();
			return task1.join() + task2.join();
			
			
		}
		
	}
}
