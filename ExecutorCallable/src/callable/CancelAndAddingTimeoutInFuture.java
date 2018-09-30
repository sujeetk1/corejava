package callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/*
 * Program to cancel the task if it's taking more than 20 milliseconds
 */
/**
 * 
 * @author sujeetk1
 *
 */
public class CancelAndAddingTimeoutInFuture {

	public static void main(String[] args) {
		
		ExecutorService execService = null;
		
		try{
			/*
			 * SingleThreadExecutor created, it will create only one worker thread
			 */
			execService = Executors.newSingleThreadExecutor();
			long sTime = System.currentTimeMillis();
			/*
			 * submitting the task
			 */
			Future<String> future1 = execService.submit(new MyCallableTask(new RemoteService()));
			
			while(!future1.isDone()){
				long totalTime = System.currentTimeMillis() - sTime;
				/*
				 * if time taken is more than cancel the task
				 */
				if(totalTime > 20){
					System.out.println("Task is taking long time to execute so cancelling it....");
					/*
					 * Cancelling the task
					 */
					future1.cancel(true);
				}
			}
			
			String result;
			try {
				/*
				 * if Future object is not returning within one second, then cancel the task
				 * Or return the result
				 */
				result = future1.get(1, TimeUnit.SECONDS);
				System.out.println(result);
			} catch (InterruptedException | ExecutionException | TimeoutException e) {
				e.printStackTrace();
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(execService != null)
				execService.shutdown();
		}
		
	}

}
