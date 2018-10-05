package singleton;

/*
 * Program of Singleton Pattern
 */

/**
 * 
 * @author sujeetk1
 *
 */
public class Singleton {

	private Singleton() {
	}

	private static class SingletonHelper {
		private static final Singleton INSTANCE = new Singleton();

		private SingletonHelper() {

		}
	}

	public Singleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
