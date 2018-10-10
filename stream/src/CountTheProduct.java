
import java.util.Arrays;
import java.util.List;

import model.Product;

/*
 * Get the count of products whose price is less than 14000
 */

/**
 * 
 * @author sujeetk1
 *
 */

public class CountTheProduct {

	public static void main(String[] args) {
		Product p1 = new Product("tv", 1, 10000);
		Product p2 = new Product("fridge", 2, 14000);
		Product p3 = new Product("dvd", 3, 20000);
		Product p4 = new Product("laptop", 4, 12000);
		
		List<Product> listOfProduct = Arrays.asList(p1,p2,p3,p4);
		
		long countOfProduct = listOfProduct.stream()
								.filter(x -> x.getPrice() < 14000)
								.count();
		
		System.out.println(countOfProduct);
	}

}
