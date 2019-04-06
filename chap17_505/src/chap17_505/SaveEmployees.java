package chap17_505;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveEmployees {

	public static void main(String[] args) throws IOException {

		Employee[] emps = new Employee[5];
		emps[0] = new Employee("Joe Smith", 45000, 'M');
		emps[1] = new Employee("Joe Shmoe", 35000, 'M');
		emps[2] = new Employee("Sally Smith", 55000, 'F');
		emps[3] = new Employee("Sally Shmoe", 35000, 'F');
		emps[4] = new Employee("Farrack Bobama", 1000000, 'M');

		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("employees.dat"));) {

			output.writeObject(emps);

		}
		System.out.println("Success!");

	}

}
