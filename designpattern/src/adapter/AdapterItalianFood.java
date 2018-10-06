/**
 * 
 */
package adapter;

/**
 * @author dell
 *
 */
public class AdapterItalianFood implements Food{
	
	Italian italian = new Italian();

	@Override
	public void getFood() {
		italian.getItalianFood();
		
	}
	
	

}
