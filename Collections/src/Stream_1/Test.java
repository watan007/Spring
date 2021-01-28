package Stream_1;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(31);
		arr.add(44);
		
		arr.forEach(n -> System.out.println(n));
		
		arr.forEach(n ->{if (n%2==0)System.out.println(n);});
		

	}

}
