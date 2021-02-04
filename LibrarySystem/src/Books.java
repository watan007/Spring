import java.io.Serializable;

public class Books implements Serializable{
	
	private int Bid;
	private String BookName, Genre;
	private double price;
	public Books(int Bid, String BookName, String author, double price) {
		super();
		this.Bid = Bid;
		this.BookName = BookName;
		this.Genre = Genre;
		this.price = price;
	}
	public Books() {
		Bid = 0;
		BookName = null;
		Genre = null;
		price = 0;
		
	}
	@Override
	public String toString() {
		return "\nBid: " + Bid + "\nBookName=" + BookName + "\nGenre=" + Genre + "\nprice=" + price + "\n";
	}
	
	
	
}
