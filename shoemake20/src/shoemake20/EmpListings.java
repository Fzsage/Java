package shoemake20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class EmpListings {

	public static void main(String[] args) {
		
		LinkedList<Employee> staff = new LinkedList<>();
		staff.add(new Employee("Otto Mattik", 33, 50000));
		staff.add(new Employee("Mary Knate", 28, 95000));
		staff.add(new Employee("Sally Forth", 45, 75000));
		
		Employee clerk = new Employee("Sarah Desert", 27, 110000);
		Employee security = new Employee("Gus Tavwind", 40, 30000);
		
		staff.addFirst(clerk);
		staff.addLast(security);
		
		ListIterator<Employee> it = staff.listIterator();
		while (it.hasNext()){
			System.out.println(it.next().toString());
		}
		
		while (it.hasPrevious()){
			System.out.println(it.previous());
		}
		
		ArrayList<Employee> emps = new ArrayList<>(staff);
		for(Employee e : emps){
			System.out.println(e);
		}
		
		System.out.println("Employees sorted by age:");
		Collections.sort(staff, new AgeComparator());
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("\nSorted by salary, high to low");
		Collections.sort(staff, new SalaryComparator());
		
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
		Employee highest = Collections.max(staff, new SalaryComparator());
		System.out.println("\nHighest paid employee" + highest);
		
		List<Employee> nonUnion = Arrays.asList(clerk, security);
		System.out.println(nonUnion);
		
		Vector<Employee> victor = new Vector<Employee>(staff);
		System.out.println(victor.get(2));
	}

}
