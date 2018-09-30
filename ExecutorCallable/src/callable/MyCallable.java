package callable;

import java.util.concurrent.Callable;

/*
 * Program to implement Callable interface and define the call() method for task
 */
/**
 * 
 * @author sujeetk1
 *
 */
public class MyCallable implements Callable<Integer> {
	
	private Integer number;
	
	/*
	 *call() method will give the sum of 1 to number 
	 */
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i = 0; i <= number; i++){
			sum += i;
		}
		
		return sum;
	}
	/*
	 * Constructor
	 * @param integer
	 */
	public MyCallable(Integer number) {
		this.number = number;
	}

}
