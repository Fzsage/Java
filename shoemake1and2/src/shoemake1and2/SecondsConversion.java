// Sage Shoemake 2150725
// Program that will take a time in seconds and convert it to hours, minutes, and seconds

package shoemake1and2;

import java.util.Scanner;

public class SecondsConversion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Prompt user for a number in seconds
		System.out.println("Enter a time in seconds ");
		
		// Get input in seconds
		int seconds = input.nextInt();
		
		input.close();
		
		// Convert seconds to hours, minutes, seconds
		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		int secondsfinal = seconds % 60;
		
		System.out.println("There are " + hours + " hour(s), " + minutes + " minute(s), " + "and " + secondsfinal + " second(s).");
		
	}

}
