package callable;

/*
 * Program to use it like remote services
 */
/**
 * 
 * @author sujeetk1
 *
 */

public class RemoteService {
	
	/*
	 * remoteService() method having sleep() to sleep for 10 milliseconds, like using any remote service
	 */
	public String remoteService(){
		try{
			Thread.sleep(10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		return "Remote Service";
	}
}
