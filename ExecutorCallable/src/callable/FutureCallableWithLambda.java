package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/*
 * Program which is using lambda to create Callable object
 */

/**
 * 
 * @author sujeetk1
 *
 */

public class FutureCallableWithLambda {

	public static void main(String[] args) {
		/*
		 * Implementing call() method through lambda to create task
		 * @return string
		 */
		Callable<String> task1 = ()->"My Task1....";
		
		/*
		 * Implementing call() method through lambda to create task
		 * @return even number sum
		 */
		Callable<Integer> task2 = ()->{
			int sum = 0;
			for(int i = 0; i <=100 ; i++){
				if(i % 2 == 0){
					sum += i;
				}
			}
			return sum;
		};
		/*
		 * Implementing call() method through lambda to create task
		 * @return odd number sum
		 */
		Callable<Integer> task3 = ()->{
			int sum = 0;
			for(int i = 0; i <=100 ; i++){
				if(i % 2 == 1){
					sum += i;
				}
			}
			return sum;
		};
		/*
		 * Creating ExecutorService object with fixedThreadPool
		 * @param number of worker thread
		 */
		ExecutorService execService = Executors.newFixedThreadPool(2);
		/*
		 * submitting all task to ExecutorService
		 * @param Callable task
		 */
		Future<String>future1 = execService.submit(task1);
		Future<Integer>future2 = execService.submit(task2);
		Future<Integer>future3 = execService.submit(task3);
		
		
		try {
			/*
			 * get() method blocks until the Future object returned by the ExcecutorService
			 */
			System.out.println("Task 1:::"+future1.get());
			/*
			 * get(long, TimeUnit) method blocks until the Future object returned by the ExcecutorService
			 * @param maximum time to wait
			 * @param  the time unit of the timeout argument
			 * @return if maximum time out exceed, then it will throw TimeoutException exception
			 */
			System.out.println("Task 2(Sum of even number):::"+future2.get(2, TimeUnit.SECONDS));
			System.out.println("Task 3(Sum of odd number):::"+future3.get());
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}
		
		/*
		 * shutting down the ExecutorService after completing the task
		 */
		execService.shutdown();
		
	}

}
