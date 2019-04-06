// This program will prompt the user to input an even number divisible by 29 and under 500

package shoemake3;

import java.util.Scanner;

public class EvenMultiple {

	public static void main(String[] args) {
		
		// Prompt user to enter a number
		System.out.println("Enter an even number that is divisible by 29 and less than 500");
		
		// Get input
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		// If correct
		if (num % 2 == 0 && num % 29 == 0 && num < 500) {
			System.out.println("Congrats! That is a valid number");
		}
		// If 2 parts are true and 1 is incorrect output
		else if (num % 2 != 0 && num % 29 == 0 && num < 500) {
			System.out.println("That is not an even number");
		}
		else if (num % 2 == 0 && num % 29 != 0 && num < 500) {
			System.out.println("That number is not divisble by 29");
		}
		else if (num % 2 == 0 && num % 29 == 0 && num >= 500) {
			System.out.println("That number is not less than 500");
		}
		// If two or more parts are incorrect aka user was way off
		else {
			System.out.println("That is not a valid number. Please try again.");
		}

	}

}
