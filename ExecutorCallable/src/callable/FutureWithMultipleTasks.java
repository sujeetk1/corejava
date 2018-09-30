package callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Program to execute the List of task and return the Future List
 */

/**
 * 
 * @author sujeetk1
 *
 */
public class FutureWithMultipleTasks {

	public static void main(String[] args) {
		/*
		 * Callable task created by lambda
		 */
		Callable<String> task1 = ()->{
			Thread.sleep(10000);
			return "Task1 completed...";
		};
		
		Callable<String> task2 = ()->{
			Thread.sleep(1000);
			return "Task2 completed...";
		};
		
		Callable<String> task3 = ()->{
			Thread.sleep(1000);
			return "Task3 completed...";
		};
		/*
		 * Adding the tasks to the List
		 */
		List<Callable<String>> taskList = new ArrayList<>();
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		/*
		 * ExecutorService created with FixedThreadPool
		 * @param Thread pool size
		 */
		ExecutorService execService = Executors.newFixedThreadPool(3);
		
		List<Future<String>> futureList = null;
  		try {
			/*
			 * Return the List of Future Object
			 * @param List of tasks
			 */
  			futureList = execService.invokeAll(taskList);
			for(Future<String> future : futureList){
				System.out.println(future.get());
			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}finally {
			if(execService != null)
				execService.shutdown();
		}
	}

}
