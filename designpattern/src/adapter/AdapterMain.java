/**
 * 
 */
package adapter;

/**
 * @author sujeetk1
 *
 */
public class AdapterMain {

	public static void main(String[] args) {
		
		AdapterItalianFood adapterItalianFood = new AdapterItalianFood();
		Resturant resturant = new Resturant();
		resturant.setFood(adapterItalianFood);
		resturant.serveFood();
		

	}

}
