// This program will take user input for a name and use a method
// to output the name alphabetically, the name backwards, and the number
// of characters in the name

package shoemake6;

import java.util.Scanner;

public class StringerProgram {

	public static void main(String[] args) {

		
		// Get user input
		System.out.println("Please enter your full name.");
		Scanner input = new Scanner(System.in);
		String inputName = input.nextLine();
		input.close();
		
		// Run method
		Stringer.stringer(inputName);
		
	}

}
