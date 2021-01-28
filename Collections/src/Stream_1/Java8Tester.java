package Stream_1;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Tester {

	public static void main(String[] args) {
		
		System.out.println("Using java 8: ");
		
		List<String> strings=Arrays.asList("abc", "", "bc", "efg", "abcd","","jkl");
		
		System.out.println("String: "+ strings );
		
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty string: "+count);
		
		count=strings.stream().filter(string -> string.length()==3).count();
		System.out.println("String of length: " +count);
		
		List<String> filtered=strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered list: "+filtered);
		
		String mergedString=strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(","));
		System.out.println("Merge List: "+mergedString);
		
		List<Integer> numbers=Arrays.asList(3,2,2,3,7,3,5);
		
		List<Integer> squareList=numbers.stream().map(i ->i*i).distinct().collect(Collectors.toList());
		System.out.println("Square List: "+squareList);
		
		List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		System.out.println("List: "+integers);
		
		IntSummaryStatistics stats=integers.stream().mapToInt((x)->x).summaryStatistics();
		
		System.out.println("Highest number in List: "+stats.getMax());
		System.out.println("Lowest in the List: "+stats.getMin());
		System.out.println("Sum of all numbers "+stats.getSum());
		System.out.println("Average numbers: "+stats.getAverage());
		// System.out.println("Random number: ");

	}

	
	
	
	
	

}
