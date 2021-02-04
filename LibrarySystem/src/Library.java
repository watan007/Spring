import java.io.Serializable;
import java.util.*;

public class Library extends Object implements Serializable{
	
	private List<Books> collection;
	
	public Library() {
	collection=new ArrayList<Books>();
	}
	
	public void addBook(Books book) {
		collection.add(book);
	}

	@Override
	public String toString() {     
		String total="\n";
		/*for(int i=0;i<collection.size();i++) {
			Books b=collection.get(i);
			total=total+b.toString();
		}*/
		Iterator<Books> i=collection.iterator();
		while(i.hasNext()) {
			Books b=i.next();
			total=total+b.toString();
		}
		return total;
	}
	
	
}
