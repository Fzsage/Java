package shoemake13;

import java.util.ArrayList;
import java.util.Collections;

public class TestAutos {

	public static void main(String[] args) {
		
		Automobile wrx = new Automobile ("Subaru", "WRX", 2017, 26995); // Create instances of Automobile
		Automobile brz = new Automobile ("Subaru", "BRZ", 2017, 24995);
		Automobile fst = new Automobile ("Ford", "Focus ST", 2016, 24695);
		Automobile camaro = new Automobile ("Chevrolet", "Camaro", 2017, 30495);
		Automobile mustang = new Automobile ("Ford", "Mustang", 2016, 27595);
		
		ArrayList<Automobile> autoList = new ArrayList<Automobile>(); // new ArrayList to hold automobiles
		autoList.add(wrx); // Push automobiles to arraylist
		autoList.add(brz);
		autoList.add(fst);
		autoList.add(camaro);
		autoList.add(mustang);
		
		for (Automobile a : autoList){ // for each automobile, output its properties
			System.out.println(a);;
		}
		
		Collections.sort(autoList); // sort arraylist by price
		System.out.println();
		System.out.println("Sorted by price");
		
		for (Automobile a : autoList){ // print new list sorted by price
			System.out.println(a);;
		}
		
	}

}
