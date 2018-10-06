/**
 * 
 */
package adapter;

/**
 * @author sujeetk1
 *
 */
public class Resturant {
	
	private Food food;

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	
	public void serveFood(){
		food.getFood();
	}
}
