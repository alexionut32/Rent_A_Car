package model;

import java.math.BigInteger;

public class Car {

	private BigInteger carID;
	private String brand;
	private String model;
	private int price_per_day;
	private int available;

	public Car() {
	}

	public Car(BigInteger carID, String brand, String model, int price_per_day, int available) {
		this.carID = carID;
		this.brand = brand;
		this.model = model;
		this.price_per_day = price_per_day;
		this.available = available;
	}

	public Car(String brand, String model, int price_per_day, int available) {
		this.brand = brand;
		this.model = model;
		this.price_per_day = price_per_day;
		this.available = available;
	}

	public BigInteger getCarID() {
		return carID;
	}

	public void setCarID(BigInteger carID) {
		this.carID = carID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice_per_day() {
		return price_per_day;
	}

	public void setPrice_per_day(int price_per_day) {
		this.price_per_day = price_per_day;
	}

	public int isAvailable() {
		return available;
	}

	public void setAvailable(int availability) {
		this.available = availability;
	}

	@Override
	public String toString() {
		return "\nCar: carID=" + carID + ", brand=" + brand + ", model=" + model + ", price_per_day=" + price_per_day
				+ ", availability=" + available + "\n";
	}

}
