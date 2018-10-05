

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortObjectInTreeSetUsingComarator {

	public static void main(String[] args) {
		Set<Employee> empset = new HashSet<>();
		empset.add(new Employee("john", 1, 23, "new york"));
		empset.add(new Employee("sam", 2, 21, "london"));
		empset.add(new Employee("rick", 5, 33, "delhi"));
		empset.add(new Employee("sean", 4, 23, "london"));
		empset.add(new Employee("john", 2, 34, "tokyo"));

		empset.stream().forEach(System.out::println);
		System.out.println("Sorting Set");
		empset = sortAccordingToCity(empset);
		empset.stream().forEach(System.out::println);

	}

	/*
	 * Method to sort the set in Ascending order
	 * 
	 * @param set
	 * 
	 * @return set (sorted one)
	 */
	private static Set<Employee> sortAccordingToCity(Set<Employee> empSet) {
		Set<Employee> sortSet = new TreeSet<Employee>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getCity().compareTo(o2.getCity());

			}

		});
		for (Employee emp : empSet)
			sortSet.add(emp);
		return sortSet;
	}

}
