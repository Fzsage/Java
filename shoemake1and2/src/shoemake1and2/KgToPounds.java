// Sage Shoemake 20150725
// Program to take user input (weight in kg) and display it as weight in lbs

package shoemake1and2;

import java.util.Scanner;

public class KgToPounds {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter weight in kg
		System.out.println("Enter weight in kilograms ");
		
		// Get user input
		double kg = input.nextDouble();
		
		input.close();
		
		// Convert kg to lbs
		double weightlbs = (kg * 2.20462);
		
		// Display weight in lbs
		System.out.println("The converted weight in lbs is " + weightlbs);

	}

}
