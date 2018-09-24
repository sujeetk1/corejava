

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

	/*
	 * Program to create Multiple worker thread which will complete all tasks
	 */
	
	/**
	 * 
	 * @author sujeetk1
	 *
	 */

public class ExecutorWithMultipleWorkerThread {

	public static void main(String[] args) {
		/*
		 * newFixedThreadPool will create the thread pool
		 * @param number of worker thread
		 */
		ExecutorService execService = Executors.newFixedThreadPool(2);
		
		/*
		 * creating task to submit to ExecutorService
		 */
		Runnable task1 = ()->{
			System.out.println(Thread.currentThread().getName()+" :: Task1....");
		};
		
		Runnable task2 = ()->{
			System.out.println(Thread.currentThread().getName()+" :: Task2....");
		};
		
		Runnable task3 = ()->{
			System.out.println(Thread.currentThread().getName()+" :: Task3....");
		};
		
		/*
		 * Submitting the task
		 */
		execService.submit(task1);
		execService.submit(task2);
		execService.submit(task3);
		/*
		 * shutting down the ExecutorService after completing the task
		 */
		execService.shutdown();
	}

}
