package callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Program to invoke any one task, which will complete first
 */
/**
 * 
 * @author sujeetk1
 *
 */
public class InvokeAnyTasks {

	public static void main(String[] args) {

		/*
		 * creating Callable to submit the task
		 */
		Callable<String> task1 = ()->{
			Thread.sleep(1000);
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
		 * Adding the task to the List
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
		
		try {
			/*
			 * One task will return, which one complete first
			 * @param passing the List of tasks
			 */
			String result = execService.invokeAny(taskList);
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}finally {
			if(execService != null)
				execService.shutdown();
		}
	

	}

}
