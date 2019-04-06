package chap17_505;

import java.io.Serializable;

public class Employee implements Serializable {
	private String fullName;
	private double salary;
	private char gender;
	
	public Employee(String fullName, double salary, char gender) {
		super();
		this.fullName = fullName;
		this.salary = salary;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [fullName=" + fullName + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
}
