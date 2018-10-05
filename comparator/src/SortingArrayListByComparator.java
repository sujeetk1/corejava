

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArrayListByComparator {

	public static void main(String[] args) {
		List<Person> empList = new ArrayList<>();
		empList.add(new Person("john", 23));
		empList.add(new Person("sam", 21));
		empList.add(new Person("rick", 33));
		empList.add(new Person("sean", 23));
		empList.add(new Person("adam", 34));

		Collections.sort(empList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		empList.stream().forEach(System.out::println);

	}

}
