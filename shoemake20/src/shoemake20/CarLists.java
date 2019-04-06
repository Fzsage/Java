package shoemake20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class CarLists {

	public static void main(String[] args) {
		
		ArrayList<Car> cars = new ArrayList<>(); // add 6 new cars to arrayList
		cars.add(new Car("Subaru", "WRX", 30000));
		cars.add(new Car("Porsche", "911", 89400));
		cars.add(new Car("Nissan", "370Z", 29990));
		cars.add(new Car("Subaru", "WRX STI", 35195));
		cars.add(new Car("Ford", "Mustang GT", 32920));
		cars.add(new Car("Nissan", "GT-R", 109990));
		
		ListIterator<Car> it = cars.listIterator(); // create new iterator for arrayList and print
		while (it.hasNext()){
			System.out.println(it.next().toString());
		}
		
		Car highPrice = Collections.max(cars, new CarComparator()); // Return highest price car and print
		System.out.println("\nHighest price car is the " + highPrice);

		LinkedList<Car> linkedCars= new LinkedList<>(cars); // create new LinkedList out of the contents of arrayList
		linkedCars.add(4, new Car("Ford", "Focus ST", 24775)); // add lowest price car to index 4
		
		Collections.sort(linkedCars, new CarComparator()); // sort from low to high price
		
		
		System.out.println("\nLinked list of cars from low to high price:\n"); // print low to high price
		ListIterator<Car> lit = linkedCars.listIterator();
		while (lit.hasNext()){
			System.out.println(lit.next().toString());
		}
		
		System.out.println("\nFirst and last elements removed:\n");  // remove first and last elements and print
		linkedCars.removeFirst();
		linkedCars.removeFirst();
		
		for(Car c : linkedCars){
			System.out.println(c.toString());
		}
		
		System.out.println("\nCars from high price to low:\n"); // print high to low prices
		
		while(lit.hasPrevious()){
			System.out.println(lit.previous().toString());
		}
	}

}
