package List;

import java.util.*;

public class Linked_List {
	
	public static void main(String args[]) {
	
	LinkedList<String> carlist=new LinkedList<String>();
	
	carlist.add("McLaren Senn");
	carlist.add("Ford F-150 Raptor");
	carlist.add("Lamborghini");
	System.out.println(carlist);
	carlist.addFirst("Nexa");
	System.out.println("Add new element in 1st" +carlist);
	carlist.addLast("Tesla");
	System.out.println("Add new element in last" +carlist);
	carlist.add(2, "Tigor");
	System.out.println("Add new element in 3rd position" +carlist);
	carlist.remove("Tigor");
	System.out.println("Remove 3rd position" +carlist);
	//carlist.clear();
	System.out.println(carlist);
	carlist.pop();
	System.out.println(carlist);
	}
}
