package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Program which will use Callable to submit the task through ExecutorService
 */

/**
 * 
 * @author sujeetk1
 *
 */

public class SubmitCallableTaskByExecutor {

	public static void main(String[] args) {
		/*
		 * Callable is being used to create the task and call method returning String
		 *
		 * Note :: For Annonymous class diamond operator(jdk 1.7) will not work 
		 */
		Callable<String> task1 = new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				return "My task completed...";
			}
		};
		
		/*
		 * Only one worker thread will be created
		 */
		ExecutorService execService = Executors.newSingleThreadExecutor();
		
		/*
		 * Submitting the task through ExecutorService
		 * @param Callable task
		 * @return Future Object
		 */
		Future<String> future = execService.submit(task1);
		
		/*
		 * Checking if EcecutorService completed the task and returned the Future object
		 */
		if(future.isDone()){
			try {
				/*
				 * Printing the returned object by the call() method
				 * The get() method will throw checked Exception 
				 */
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			} 
		}
		
		/*
		 * Created separate task which will return the sum of 1 to n
		 * @param integer 
		 */
		MyCallable myTask = new MyCallable(10);
		
		/*
		 * submitting the task and returning the integer 
		 */
		Future<Integer> myTaskFuture = execService.submit(myTask);
		
		try {
			/*
			 * Printing the returned object by the call() method
			 * The get() method will throw checked Exception 
			 */
			System.out.println(myTaskFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		

	}

}
