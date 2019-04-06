package shoemake10;

public class Vehicle {
	private String make;
	private String model;
	private int year;
	private double price;
	private Motor motor;
	
	public Vehicle(String make, String model, int year, double price, Motor motor) {
		
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.motor = motor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return year + " " + make + " " + model + ", price= " + price + "\n" +  motor.toString();
	}
}
