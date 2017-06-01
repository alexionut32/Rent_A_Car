package model;

import java.math.BigInteger;

public class Customer {

	private BigInteger customerID;
	private BigInteger cnp;
	private String name;
	private String address;
	private String username;
	private String password;

	public Customer() {
	}

	public Customer(BigInteger customerID, BigInteger cnp, String name, String address, String username,
			String password) {
		this.customerID = customerID;
		this.cnp = cnp;
		this.name = name;
		this.address = address;
		this.username = username;
		this.password = password;
	}

	public Customer(BigInteger cnp, String name, String address, String username, String password) {
		this.cnp = cnp;
		this.name = name;
		this.address = address;
		this.username = username;
		this.password = password;
	}

	public BigInteger getCustomerID() {
		return customerID;
	}

	public void setCustomerID(BigInteger customerID) {
		this.customerID = customerID;
	}

	public BigInteger getCnp() {
		return cnp;
	}

	public void setCnp(BigInteger cnp) {
		this.cnp = cnp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "\nCustomer: customerID=" + customerID + ", cnp=" + cnp + ", name=" + name + ", address=" + address
				+ ", username=" + username + ", password=" + password + "\n";
	}

}
