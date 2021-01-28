package Map_Pack;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> demomap=new HashMap<String, Integer>();
		demomap.put("Anil", (50));
		demomap.put("riya", (80));
		demomap.put("raju",(65));
		demomap.put("john", (49));
		System.out.println(demomap);
		
		Map<String,Integer> demomap1=new LinkedHashMap<String, Integer>();
		demomap1.put("Anil", (50));
		demomap1.put("riya", (80));
		demomap1.put("raju",(65));
		demomap1.put("john", (49));
		System.out.println(demomap1);
		
		Map<String,Integer> demomap2=new TreeMap<String, Integer>();
		demomap2.put("Anil", (50));
		demomap2.put("riya", (80));
		demomap2.put("raju",(65));
		demomap2.put("john", (49));
		System.out.println(demomap2);
		
		for(Map.Entry map:demomap1.entrySet()) {
			System.out.println(map.getKey());
		} 
		
	

	}

}
