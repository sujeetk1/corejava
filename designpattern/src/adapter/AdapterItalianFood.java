/**
 * 
 */
package adapter;

/**
 * @author sujeetk1
 *
 */
public class AdapterItalianFood implements Food{
	
	Italian italian = new Italian();

	@Override
	public void getFood() {
		italian.getItalianFood();
		
	}
	
	

}
