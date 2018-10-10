
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.Person;


	/*
	 * getting the specific person from the list
	 */

/**
 * 
 * @author sujeetk1
 *
 */

public class FilterPersonUsingStream {

	public static void main(String[] args) {
		Person p1 = new Person("andrew", 1, 23);
		Person p2 = new Person("andy", 2, 55);
		Person p3 = new Person("parker", 3, 20);
		Person p4 = new Person("lizzy", 4, 43);
		
		List<Person> listOfPerson = Arrays.asList(p1,p2,p3,p4);
		
		//Return the specific person
		listOfPerson.stream()
					.filter(x -> "lizzy".equals(x.getName()))
					.collect(Collectors.toList())
					.forEach(System.out::println);
		
		//Returns Person if person exist
		Person person =listOfPerson.stream()
							.filter(x -> "andrew".equals(x.getName()))
							.findAny()
							.orElse(null);
		
		System.out.println(person);
		
		

	}

}
