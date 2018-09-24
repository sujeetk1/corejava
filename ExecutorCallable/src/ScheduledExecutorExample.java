

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * scheduling the task in this program through ScheduledExecutorService 
 */

/**
 * 
 * @author sujeetk1
 *
 */
public class ScheduledExecutorExample {

	public static void main(String[] args) {
		
		/*
		 * scheduling the task through worker thread
		 * @param number of thread
		 */
		ScheduledExecutorService execService = Executors.newScheduledThreadPool(1);
		/*
		 * Runnable task created as MyTask
		 */
		MyTask myTask = new MyTask();
		/*
		 * ScheduledExecutorService will run or schedule the myTask after 5 seconds(only one time scheduled)
		 * @param task to complete
		 * @param start after 5 seconds
		 * @param time unit for execution
		 */
		execService.schedule(myTask, 5, TimeUnit.SECONDS);
		/*
		 * scheduleAtFixedRate method of ScheduledExecutorService will execute after certain interval
		 * @param  task to complete
		 * @param first start after 0 seconds
		 * @param run after every 5 seconds
		 * @param time unit for execution
		 */
		//execService.scheduleAtFixedRate(myTask, 0, 5, TimeUnit.SECONDS);
		
		/*
		 * while using scheduleAtFixedRate, shutdown method should not be called.
		 * otherwise it will execute only one time.
		 */
		execService.shutdown();
	}

}
