/**
 * 
 */
package factory;

/**
 * @author sujeetk1
 *
 */
public class AccountFactory {
	
	public Account getInstance(String accountType){
		
		if(accountType.equals("SAVING")){
			return new SavingAccount();
		}else if(accountType.equals("STUDENT_SAVING")){
			return new StudentSavingAccount();
		}else if(accountType.equals("CURRENT")){
			return new CurrentAccount();
		}else{
			return null;
		}
		
	}
}
