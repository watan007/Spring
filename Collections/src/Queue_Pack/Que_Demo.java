package Queue_Pack;

import java.util.*;

public class Que_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();
		
		queue.add("Orange");
		queue.add("Guava");
		queue.add("Apple");
		queue.add("Pineapple");
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.element());
		queue.remove();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);

	}

}
