import java.util.Date;

public class Issue {
	
	private int IID, UID, BID;
	private Date IssueDate;
	private int period;
	private Date ReturnDate;
	private int fine;
	public Issue(int iID, int uID, int bID, Date issueDate, int period, Date returnDate, int fine) {
		super();
		IID = iID;
		UID = uID;
		BID = bID;
		IssueDate = issueDate;
		this.period = period;
		ReturnDate = returnDate;
		this.fine = fine;
	}
	public Issue() {
		IID = 0;
		UID = 0;
		BID = 0;
		IssueDate = null;
		period = 0;
		ReturnDate = null;
		fine = 0;
	}
	@Override
	public String toString() {
		return "\nIID: " + IID + "\nUID: " + UID + "\nBID: " + BID + "\nIssueDate: " + IssueDate + "\nperiod: " + period
				+ "\nReturnDate: " + ReturnDate + "\nfine: " + fine + "]";
	}
	
	
	
	
	

}
