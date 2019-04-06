package shoemake17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class ReadVehicles {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("vehicles.dat"));) {
			Vehicle[] vehicles = (Vehicle[]) input.readObject(); // read vehicle array
			for (Vehicle i : vehicles){
				System.out.println(i); // print vehicle array
			}

	}

}
}