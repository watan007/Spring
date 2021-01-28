package Stream;
import java.util.*;
import java.util.Arrays;
import java.util.stream.*;
import java.util.stream.Collectors;

public class StreamBuilder {

	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(2,3,4,5);
		
		List<Integer> square=number.stream().map(x -> x*x).collect(Collectors.toList());
		
		System.out.println(square);
		
		List<String> names=Arrays.asList("Reflection", "Collection", "Stream");
		
		List<String> result=names.stream().filter(n -> n.startsWith("C"))
									.collect(Collectors.toList());
		
		System.out.println(result);
		
		List<String> show=names.stream().sorted().collect(Collectors.toList());
		
		System.out.println(show);
		
		List<Integer> numbers=Arrays.asList(2,3,4,5,2);
		
		Set<Integer> squareset=numbers.stream().map(x->x*x).collect(Collectors.toSet());
		
		System.out.println(squareset);
		
		numbers.stream().map(x->x*x).forEach(y-> System.out.println(y));
		
		int even=numbers.stream().filter(x->x%2==0).reduce(4,(ans,i)-> ans+i);
		
		System.out.println(even);
		
	}

}
