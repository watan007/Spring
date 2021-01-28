package Problem1;

import java.util.*;

public class FreshBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> booklist=new ArrayList<String>();
		
		booklist.add("Daring Greatly");
		booklist.add("Lean In");
		booklist.add("The element: How finding your passion change everything");
		booklist.add("Arafel");
		booklist.add("The Bartimaeus Trilogy ");
		booklist.add("Black Blossom ");
		booklist.add("The Crock of Gold ");
		booklist.add("The Enchanted Castle");
		booklist.add("Flesh and Fire ");
		booklist.add("The Ghost and The Goth ");
		booklist.add("The Crock of Gold ");
		booklist.add("Black Blossom ");
		booklist.add("Lean In");
		booklist.add("The element: How finding your passion change everything");
		booklist.add("Daring Greatly");
		
		System.out.println("The size of the library: " +booklist.size());
		
		Set<String> distinct_book=new HashSet<>();
		
		for(int i=0;i<booklist.size();i++) {
			
			distinct_book.add(booklist.get(i));
		}
		
		System.out.println(distinct_book);
		System.out.println("Total distinct book: " +distinct_book.size());
		
		HashMap<String, ArrayList<String>> library=new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> blist=new ArrayList<String>();
		
		blist.add("Daring Greatly ");
		blist.add("Black Blossom ");
		blist.add("Lean In ");
		
		library.put("Educational", blist);
		
		ArrayList<String> novel=new ArrayList<String>();
		
		novel.add("The Lion, The Witch, and the Wardrobe ");
		novel.add("Alice's Adventures in Wonderland ");
		novel.add("The Hobbit");
		
		library.put("Novel", novel);
		
		ArrayList<String> detective=new ArrayList<String>();
		
		detective.add("The Little Prince ");
		detective.add("The Lord of the Rings ");
		detective.add("A Tale of Two Cities ");
		
		library.put("Detective", detective);
		
		for(Map.Entry map:library.entrySet()) {
			System.out.println("Genre: "+map.getKey()+ " "+"Booksname: "+map.getValue() );
			System.out.println();
		}
		

	}

}
