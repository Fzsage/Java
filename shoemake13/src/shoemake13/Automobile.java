package shoemake13;

public class Automobile implements Comparable<Automobile> {
	String make;
	String model;
	int year;
	int price;
	
	public Automobile(String make, String model, int year, int price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Automobile [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	@Override
    public int compareTo( final Automobile other) {
        return Integer.compare(this.price, other.price);
    }
}
