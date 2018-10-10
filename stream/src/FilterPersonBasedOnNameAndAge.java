
import java.util.Arrays;
import java.util.List;

import model.Person;

	/*
	 * Getting the Person on Based of multiple crieteria
	 */

/**
 * 
 * @author sujeetk1
 *
 */
public class FilterPersonBasedOnNameAndAge {

	public static void main(String[] args) {
		Person p1 = new Person("andrew", 1, 23);
		Person p2 = new Person("andy", 2, 55);
		Person p3 = new Person("parker", 3, 20);
		Person p4 = new Person("lizzy", 4, 43);
		
		List<Person> listOfPerson = Arrays.asList(p1,p2,p3,p4);
		
		Person person = listOfPerson.stream()
							.filter(x -> "andy".equals(x.getName()) && 55 == x.getAge())
							.findAny()
							.orElse(null);
		
		System.out.println(person);
		
	}

}
