package shoemake20;

public class Car {
	
	private String make;
	private String model;
	private double price;
	
	public Car(String make, String model, double price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		
	
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return make + " " + model + " : $" + price ;
	}
	
	
	
}
