package shoemake12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		
		ArrayList<Integer>[] intArray = new ArrayList[10]; // Create new array list
		intArray[0].add(1); intArray[1].add(7); intArray[2].add(69); intArray[3].add(33); intArray[4].add(52); // Add ints to array
		intArray[5].add(99); intArray[6].add(13); intArray[7].add(40); intArray[8].add(21); intArray[9].add(70);
		
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number you are looking for.");
		int num = input.nextInt(); // Get int from user input
		
		 try {
		      returnIndex(intArray, num); // See if number entered by user exists in array
		    }
		    catch (ArrayStoreException ex) {
		      System.out.println("Exception: That number does not exist"); // Throw exception if not
		    }
		
		
		

	}
	
	public static int returnIndex(ArrayList<Integer>[] ara, int needle) {
		Integer num2 = needle;
		if(ara.contains(num2)){
			return ara.indexOf(num2);
		}
		else{
			throw new ArrayStoreException("That number does not exist in array.");
		}
	}

}
