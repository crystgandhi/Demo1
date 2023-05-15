

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		// Ascending
		List<Integer> numlist = Arrays.asList(47, 27, 98, 95, 35, 734);
		numlist.stream().sorted().forEach(n -> System.out.println(n));
		System.out.println();
		numlist.stream().sorted((a, b) -> a - b).forEach(n -> System.out.println(n));
		System.out.println();
		// descending
		List<Integer> numbers = Arrays.asList(47, 27, 98, 95, 35, 734);
		numbers.stream().sorted((a, b) -> b - a).forEach(System.out::println);

		List<String> names = Arrays.asList("Smith", "Alice", "John", "Katty", "Bob", "Carol"); 																		
		System.out.println(names);
		// Sort order
		Collections.sort(names);
		System.out.println(names);
		// Sort order
		Collections.sort(names, (a, b) -> a.compareTo(b));
		System.out.println(names);
		// Reverse order
		Collections.sort(names, (a, b) -> b.compareTo(a)); 
		System.out.println(names); 

	}

}
