package chap17_505;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmployees {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("employees.dat"));) {
			Employee[] emp = (Employee[]) input.readObject();
			for (Employee i : emp){
				System.out.println(i);
			}
		}
	}
}
