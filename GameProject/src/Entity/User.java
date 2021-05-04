package Entity;

public class User {
	String username;
	String password;
	String nationalNumber;
	
	public User(String username, String password, String nationalNumber) {
		this.username = username;
		this.password = password;
		this.nationalNumber = nationalNumber;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNationalNumber() {
		return nationalNumber;
	}
	public void setNationalNumber(String nationalNumber) {
		this.nationalNumber = nationalNumber;
	}
}
