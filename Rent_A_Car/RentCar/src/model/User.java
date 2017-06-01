package model;

import java.math.BigInteger;

public class User {
	private BigInteger userID;
	private String name;
	private String username;
	private String password;
	private boolean isAdmin;

	public User(BigInteger userID, String name, String username, String password, boolean isAdmin) {
		this.userID = userID;
		this.name = name;
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public User() {

	}

	public User(String name, String username, String password, boolean isAdmin) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public BigInteger getUserID() {
		return userID;
	}

	public void setUserID(BigInteger userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "\nUser: userID=" + userID + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", isAdmin=" + isAdmin + "\n";
	}

}
