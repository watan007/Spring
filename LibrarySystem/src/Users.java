
public class Users {
	
	private int UID;
	private String Username, Password;
	private String Admin;
	public Users(int uID, String username, String password, String admin) {
		super();
		UID = uID;
		Username = username;
		Password = password;
		Admin = admin;
	}
	
	public Users() {
		UID = 0;
		Username = null;
		Password = null;
		Admin = null;
	}

	@Override
	public String toString() {
		return "\nUID:" + UID + "\nUsername: " + Username + "\nPassword: " + Password + "\nAdmin: " + Admin + "\n";
	}
	
	
	
	
	
	
	
	

}
