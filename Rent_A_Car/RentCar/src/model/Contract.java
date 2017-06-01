package model;

import java.math.BigInteger;

public class Contract {
	private BigInteger contractID;
	private BigInteger carID;
	private BigInteger customerID;
	private String starting_date;
	private String ending_date;
	private BigInteger cost;

	public Contract() {
	}

	public Contract(BigInteger contractID, BigInteger carID, BigInteger customerID, String starting_date,
			String ending_date, BigInteger cost) {
		this.contractID = contractID;
		this.carID = carID;
		this.customerID = customerID;
		this.starting_date = starting_date;
		this.ending_date = ending_date;
		this.cost = cost;
	}

	public Contract(BigInteger carID, BigInteger customerID, String starting_date, String ending_date,
			BigInteger cost) {
		super();
		this.carID = carID;
		this.customerID = customerID;
		this.starting_date = starting_date;
		this.ending_date = ending_date;
		this.cost = cost;
	}

	public BigInteger getContractID() {
		return contractID;
	}

	public void setContractID(BigInteger contractID) {
		this.contractID = contractID;
	}

	public BigInteger getCarID() {
		return carID;
	}

	public void setCarID(BigInteger carID) {
		this.carID = carID;
	}

	public BigInteger getCustomerID() {
		return customerID;
	}

	public void setCustomerID(BigInteger customerID) {
		this.customerID = customerID;
	}

	public String getStarting_date() {
		return starting_date;
	}

	public void setStarting_date(String starting_date) {
		this.starting_date = starting_date;
	}

	public String getEnding_date() {
		return ending_date;
	}

	public void setEnding_date(String ending_date) {
		this.ending_date = ending_date;
	}

	public BigInteger getCost() {
		return cost;
	}

	public void setCost(BigInteger cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "\nContract: contractID=" + contractID + ", carID=" + carID + ", customerID=" + customerID
				+ ", starting_date=" + starting_date + ", ending_date=" + ending_date + ", cost=" + cost + "\n";
	}

}
