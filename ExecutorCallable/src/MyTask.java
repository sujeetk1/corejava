

/*
 * Creating MyTask through Runnable, so we can consume this task.
 */

/**
 * 
 * @author sujeetk1
 *
 */
public class MyTask implements Runnable{
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+" :: My Task....");
	}
}
