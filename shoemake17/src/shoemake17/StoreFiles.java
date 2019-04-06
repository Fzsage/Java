package shoemake17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class StoreFiles {

	public static void main(String[] args) throws IOException {
		
		Integer[] ints = new Integer[5]; // create an array of integers
		ints[0] = 1; // add ints to array
		ints[1] = 2;
		ints[2] = 3;
		ints[3] = 4;
		ints[4] = 5;
		
		Date date = new Date(); // create new date object
		double dub = 5.5; // create new double
		
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Excercise17_05.dat"));) {

			output.writeObject(ints); // write int array, date, and double to file
			output.writeObject(date);
			output.writeObject(dub);

		}

	}

}
