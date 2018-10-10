
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Product;

/**
 * 
 * @author sujeetk1
 *
 */

public class MovingProductFromListToMap {

	public static void main(String[] args) {
		Product p1 = new Product("tv", 1, 10000);
		Product p2 = new Product("fridge", 2, 14000);
		Product p3 = new Product("dvd", 3, 20000);
		Product p4 = new Product("laptop", 4, 12000);
		Product p5 = new Product("laptop1", 5, 12000);

		List<Product> listOfProduct = Arrays.asList(p1, p2, p3, p4, p5);

		Map<Integer, String> set = listOfProduct.stream()
								.filter(product -> product.getPrice() < 14000)
								.collect(Collectors.toMap(product -> product.getId(), product -> product.getProductName()));

		System.out.println(set);

	}

}
