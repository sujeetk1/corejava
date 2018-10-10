
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

	/*
	 * Program to filter the list which starts with "p"
	 */
	
/**
 * 
 * @author sujeetk1
 *
 */
public class FileterNameStartsWithP {

	public static void main(String[] args) {
		List<String> listOfName = Arrays.asList("andrew", "peter", "park","alex");
		
		//Step By Step Code
		streamStepByStep(listOfName);
		
		//In one line
		
		listOfName.stream()
				  .filter(name -> name.startsWith("p"))
				  .collect(Collectors.toList())
				  .forEach(System.out::println);
	}
	
	
	public static void streamStepByStep(List<String> listOfName){
		//convert list to stream
		//returns a sequential stream
		Stream<String> stream = listOfName.stream();
		
		//filter the name starts with "p"
		//Returns the stream with given predicate
		stream = stream.filter(name -> name.startsWith("p"));
		
		//collect the output and convert stream to list
		List<String> filteredList = stream.collect(Collectors.toList());
		
		filteredList.forEach(System.out::println);
	}

}
