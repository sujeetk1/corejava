/**
 * 
 */
package factory;

/**
 * @author dell
 *
 */
public class FactoryMain {

	public static void main(String[] args) {

		Account account = null;
		
		AccountFactory accountFactory = new AccountFactory();
		account = accountFactory.getInstance("CURRENT");
		if(account != null){
			account.getAccountType();
			System.out.println("ACCOUNT CLASS OBJECT IS OF "+account.getClass().getName());
		}
	}

}
