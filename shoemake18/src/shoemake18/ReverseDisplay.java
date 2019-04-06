package shoemake18;

import java.util.Scanner;

public class ReverseDisplay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // new scanner object
		System.out.println("Please enter a string"); // prompt user to enter a string
		String str = input.nextLine(); // get string input from user
		
		System.out.println(reverseDisplay(str)); // display string reversely
		input.close();
	}
	public static String reverseDisplay (String str) {
		if (str.length() <= 1){ // base case
			return str;
		}
		else {
			return reverseDisplay(str.substring(1, str.length())) + str.charAt(0); // check first and last, then make a substring out of the existing chars
		}
	}
}
