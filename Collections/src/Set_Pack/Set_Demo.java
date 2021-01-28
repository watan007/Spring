package Set_Pack;

import java.util.*;
public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> newset=new HashSet<String>();
		
		newset.add("sam");
		newset.add("jay");
		newset.add("anil");
		newset.add("sam");
		
		System.out.println(newset);
		newset.remove("sam");
		System.out.println(newset);
		
		Set<Integer> set2=new HashSet<>();
		Set<Integer> set3=new TreeSet<>();
		
		set2.add(2);
		set2.add(10);
		set2.add(4);
		set2.add(2);
		set2.add(5);
		System.out.println("HashSet "+set2);
		
		set3.add(2);
		set3.add(10);
		set3.add(4);
		set3.add(2);
		set3.add(5);
		System.out.println("HashSet "+set3);
		
		

	}

}
