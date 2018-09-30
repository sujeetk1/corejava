package callable;

import java.util.concurrent.Callable;

/*
 * Program created MyCallableTask, which is implemented services to call the RemoteService 
 * implemented Callable interface 
 */

/**
 * 
 * @author sujeetk1
 *
 */
public class MyCallableTask implements Callable<String>{

	private RemoteService remoteService;
	/*
	 * Constructor
	 * @param RemoteService
	 */
	public MyCallableTask(RemoteService remoteService) {
		this.remoteService = remoteService;
	}
	/*
	 *call() method to call the remoteService() method of RemoteService class 
	 */
	@Override
	public String call() throws Exception {
		return remoteService.remoteService();
	}

}
