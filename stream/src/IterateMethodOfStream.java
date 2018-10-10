
import java.util.stream.Stream;


/**
 * 
 * @author sujeetk1
 *
 */

public class IterateMethodOfStream {

	public static void main(String[] args) {

		Stream.iterate(1, element -> element+1)
			.filter(element -> element %10 == 0)
			.limit(5)
			.forEach(System.out::println);

	}

}
