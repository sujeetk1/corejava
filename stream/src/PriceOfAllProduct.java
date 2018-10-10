
import java.util.Arrays;
import java.util.List;

import model.Product;

/*
 * Get the sum of all products price 
 */

/**
 * 
 * @author sujeetk1
 *
 */

public class PriceOfAllProduct {

	public static void main(String[] args) {
		Product p1 = new Product("tv", 1, 10000);
		Product p2 = new Product("fridge", 2, 14000);
		Product p3 = new Product("dvd", 3, 20000);
		Product p4 = new Product("laptop", 4, 12000);
		
		List<Product> listOfProduct = Arrays.asList(p1,p2,p3,p4);
		
		Integer totalPrice = listOfProduct.stream()
										.map(p -> p.getPrice())
										.reduce(0,(sum, price) -> sum+price);
		
		System.out.println(totalPrice);
		//OR
		totalPrice = listOfProduct.stream()
						.map(p -> p.getPrice())
						.reduce(0,Integer::sum);
		System.out.println(totalPrice);
	}

}
