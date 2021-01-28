package List;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String>fruitlist=new ArrayList<String>();
		
		fruitlist.add("Apple");
		fruitlist.add("Banana");
		fruitlist.add("Orange");
		fruitlist.add("Litchi");
		
		System.out.println("First List "+fruitlist);
		//System.out.println(fruitlist.get(2));
		fruitlist.set(0, "Guava");
		System.out.println("Converted List "+fruitlist);
		fruitlist.remove(1);
		System.out.println("After remove "+fruitlist);
		System.out.println("Size "+fruitlist.size());

	}

}
