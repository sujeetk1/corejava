/**
 * 
 */
package factory;

/**
 * @author sujeetk1
 *
 */
public class CurrentAccount implements Account {

	@Override
	public void getAccountType() {
		System.out.println("CURRENT ACCOUNT");
	}

}
