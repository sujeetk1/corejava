
import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

import model.Product;

	/*
	 * Using Collectors method doing math operation
	 */

/**
 * 
 * @author sujeetk1
 *
 */

public class MathOperationOnCollectors {

	public static void main(String[] args) {
		Product p1 = new Product("tv", 1, 10000);
		Product p2 = new Product("fridge", 2, 14000);
		Product p3 = new Product("dvd", 3, 20000);
		Product p4 = new Product("laptop", 4, 12000);
		
		List<Product> listOfProduct = Arrays.asList(p1,p2,p3,p4);
		
		LongSummaryStatistics longSummaryStatistics = listOfProduct.stream()
														.collect(Collectors.summarizingLong(p -> p.getPrice()));
		
		System.out.println(longSummaryStatistics);
		System.out.println("Count ::"+longSummaryStatistics.getCount());
		System.out.println("Sum ::"+longSummaryStatistics.getSum());
		System.out.println("Max Price ::"+longSummaryStatistics.getMax());
		System.out.println("Min Price ::"+longSummaryStatistics.getMin());
		System.out.println("Average Price ::"+longSummaryStatistics.getAverage());

	}

}
