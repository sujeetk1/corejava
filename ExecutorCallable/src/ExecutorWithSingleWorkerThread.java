

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

	/*
	 * Program to create Single worker thread, which will complete all tasks
	 */
	
	/**
	 * 
	 * @author sujeetk1
	 *
	 */
public class ExecutorWithSingleWorkerThread {

	public static void main(String[] args) {

		/*
		 * this will create single worker thread, and this thread will be responsible for executing all tasks
		 */
		ExecutorService execService = Executors.newSingleThreadExecutor();
		
		/*
		 * creating Annonymous class Runnable to submit the task
		 */
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() +" :: Task 1...");
			}
		}; 
		
		/*
		 * creating second task through lambda 
		 */
		
		Runnable task2 = ()->{
			System.out.println(Thread.currentThread().getName() +" :: Task 2...");
		};
		/*
		 * submitting the task to ExecutorService
		 */
		execService.submit(task1);
		execService.submit(task2);
		/*
		 * shutting down the ExecutorService after completing the task
		 */
		execService.shutdown();
		/*
		 * shutting down the ExecutorService immediately(shutdownNow()), it doesn't matter task is completed or not  
		 */
		//execService.shutdownNow();
		

	}

}
