package shoemake17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreVehicles {

	public static void main(String[] args) throws IOException {
		
		Vehicle[] vehicles = new Vehicle[6]; // create empty array to hold vehicles
		vehicles[0] = new Vehicle("Subaru", "WRX", 2017, 30995); //  create 6 vehicles anonymously using Vehicle constructor
		vehicles[1] = new Vehicle("Subaru", "BRZ", 2017, 26995);
		vehicles[2] = new Vehicle("Ford", "Mustang", 2015, 21995);
		vehicles[3] = new Vehicle("BMW", "325i", 2016, 32995);
		vehicles[4] = new Vehicle("Toyota", "4Runner", 2016, 36995);
		vehicles[5] = new Vehicle("Dodge", "RAM 3500", 2014, 32995);
		
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("vehicles.dat"));) {

			output.writeObject(vehicles); // write vehicle array to file

		}

	}

}
