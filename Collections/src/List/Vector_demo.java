 package List;
 
 import java.util.*;

public class Vector_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector newvector=new Vector();
		int capacity=newvector.capacity();
		System.out.println(capacity);
		newvector.add("Grapes");
		newvector.add("Banana");
		newvector.add("Oranges");
		System.out.println(newvector);
		System.out.println("Size of the vector"+newvector.size());
		newvector.add("Dog");
		newvector.add("Cat");
		System.out.println("Size of the new vector"+newvector);

	}

}
