

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Program to give distinct User Object using TreeSet
 */

/**
 * 
 * @author sujeetk1
 *
 */
public class DistinctObjectInTreeSetByComparator {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("john", 1, 23, "new york"));
		empList.add(new Employee("sam", 2, 21, "london"));
		empList.add(new Employee("rick", 5, 33, "delhi"));
		empList.add(new Employee("sean", 4, 23, "london"));
		empList.add(new Employee("john", 2, 34, "tokyo"));
		/*
		 * Employee city will be distinct, while adding to the empSet, using Comparator 
		 */
		Set<Employee> empSet = new TreeSet<Employee>(new Comparator<Employee>() {
			public int compare(Employee employee1, Employee employee2){
				if(employee1.getCity().equals(employee2.getCity())){
					return 0;
				} else {
		            return 1;
		        }
				
			}
		});
		
		empSet.addAll(empList);
		
		empSet.stream().forEach(System.out::println);
	}

	

}
