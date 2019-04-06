package shoemake17;

import java.io.Serializable;

public class Vehicle implements Serializable {
	private String make;
	private String model;
	private int year;
	private double price;
	public Vehicle(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	
}
