package shoemake17;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ReadFiles {

	public static void main(String[] args) throws ClassNotFoundException, IOException, EOFException {
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Excercise17_05.dat"));) {
			Integer[] ints = (Integer[]) input.readObject(); // read int array
			for (Integer i : ints) {
				System.out.println(i); // print int array
			}
			Date date = (Date) input.readObject(); // read date object
			System.out.println(date);
			double dub = (double) input.readObject(); // read double
			System.out.println(dub);

		}

	}
}